package com.vahe.model;

import java.util.List;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;
    private List<Car> cars;

    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Employee(String firstname, String lastname, int age, List<Car> cars) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.cars = cars;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +

                '}';
    }
}
