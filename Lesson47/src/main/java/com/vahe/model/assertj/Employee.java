package com.vahe.model.assertj;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("test");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("age eee");
        return age;
    }

    public void setAge(int age) {
        System.out.println("set ageee");
        this.age = age;
    }
}
