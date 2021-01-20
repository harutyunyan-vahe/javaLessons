package com.vahe;


import com.vahe.annotations.IgnoreInToString;

import java.util.regex.Pattern;


public class Employee {

    @IgnoreInToString
    private String name;


    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ToStringUtils.toStringReflection(this);
    }


//    @Override
//    public String toString() {
//        return "Employee{" +
//
//                ", age=" + age +
//                '}';
//    }
}
