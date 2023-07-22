package com.springBoot_react.fullStackProjectMaven.repository;

import com.springBoot_react.fullStackProjectMaven.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//this repo is used for implementation
public interface StudentRepository extends JpaRepository<Student, Integer> {


}