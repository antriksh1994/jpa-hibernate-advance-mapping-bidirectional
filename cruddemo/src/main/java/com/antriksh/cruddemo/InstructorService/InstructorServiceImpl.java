package com.antriksh.cruddemo.InstructorService;

import com.antriksh.cruddemo.dao.AppDAO;
import com.antriksh.cruddemo.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService{
    private AppDAO appDAO;
    @Autowired
    public InstructorServiceImpl(AppDAO theAppDAO) {
        appDAO = theAppDAO;
    }
    @Override
    public List<Instructor> findAll() {
        return appDAO.findAll();
    }

}
