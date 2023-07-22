package com.springBoot_react.fullStackProjectMaven.controller;

import com.springBoot_react.fullStackProjectMaven.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springBoot_react.fullStackProjectMaven.model.Student;

import java.util.List;

//This class is used for mapping and Estimating
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }
}
