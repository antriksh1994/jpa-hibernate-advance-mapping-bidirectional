package com.antriksh.cruddemo.dao;

import com.antriksh.cruddemo.entity.Instructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    @Transactional
    void deleteInstructorById(int theId);
    List<Instructor> findAll();
}