package com.antriksh.cruddemo.dao;

import com.antriksh.cruddemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class, theId);
    }
    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
        Instructor temp = entityManager.find(Instructor.class, theId);
        entityManager.remove(temp);
    }

    @Override
    public List<Instructor> findAll() {
        TypedQuery<Instructor> theQuery = entityManager.createQuery("from Instructor", Instructor.class);
        List<Instructor> allInstructors = theQuery.getResultList();
        System.out.println("Query: " + allInstructors);
        return  allInstructors;
    }
}