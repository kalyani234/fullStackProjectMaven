package com.springBoot_react.fullStackProjectMaven.service;

import com.springBoot_react.fullStackProjectMaven.model.Student;
import com.springBoot_react.fullStackProjectMaven.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements  StudentService{

@Autowired
private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
