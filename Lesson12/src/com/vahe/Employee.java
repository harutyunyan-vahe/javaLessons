package com.vahe;

public class Employee {

    //private , default(same class , package privet), protected(same class , child, package), public (everywhre)
    protected String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstName() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
