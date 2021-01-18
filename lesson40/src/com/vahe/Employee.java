package com.vahe;

import com.vahe.reflection.RefTest;

public class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private  String getName() {
        return name;
    }

    public void setName(String name) {
//        name = "sdfdsf";
//        final int k = 6;
//        k = 8;
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
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return RefTest.toStringReflection(this);
    }


}

