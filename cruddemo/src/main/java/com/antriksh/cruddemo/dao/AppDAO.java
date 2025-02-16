package com.antriksh.cruddemo.dao;

import com.antriksh.cruddemo.entity.Instructor;
import com.antriksh.cruddemo.entity.InstructorDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AppDAO {
    // to delete the instructor by id
    @Transactional
    void deleteInstructorById(int theId);
    // to get all the instructors
    List<Instructor> findAll();
    // to save the instructor
    void save(Instructor theInstructor);
    // to find the instructor by id
    Instructor findInstructorById(int theId);

    // to find the instructorDetail by id
    InstructorDetail findInstructorDetailById(int theId);
}