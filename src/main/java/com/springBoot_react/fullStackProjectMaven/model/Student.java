package com.springBoot_react.fullStackProjectMaven.model;
// It is used to create getters,setters , constructors as well

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
//What is the GenerationType identity?
//GenerationType. IDENTITY − In identity ,database is responsible to auto generate the primary key. Insert a row without specifying a value for the ID and after inserting the row, ask the database for the last generated ID.

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}
