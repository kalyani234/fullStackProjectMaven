package com.springBoot_react.fullStackProjectMaven.service;

import com.springBoot_react.fullStackProjectMaven.model.Student;
import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
