package com.vahe;

public class Person {

    public static int AGE = 18;

    public Car car;

    private String name;
    private int age; // 0

    public Person(String name, int age) {
        int close = 7;
        //this.name = name;
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
}
