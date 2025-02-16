package com.antriksh.cruddemo.rest;

import com.antriksh.cruddemo.InstructorService.InstructorService;
import com.antriksh.cruddemo.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorRestController {
    private InstructorService instructorService;
    @Autowired
    public InstructorRestController(InstructorService theInstructorService) {
        instructorService = theInstructorService;
    }

    @GetMapping("/instructors")
    public List<Instructor> getAllEmployees() {
        System.out.println("Fetch all employees: ");
        return instructorService.findAll();
    }
}
