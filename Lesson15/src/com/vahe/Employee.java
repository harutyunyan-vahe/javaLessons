package com.vahe;

public class Employee {

    public static Employee empty() {
        return new Employee();
    }

    public static Employee withFirstname(String firstname) {
        return new Employee(firstname);
    }

    public static Employee withFirstnameAndSalary(String firstname, double salary) {
        return new Employee(firstname, salary);
    }

    public static Employee withAll(String firstname, String lastname, double salary) {
        return new Employee(firstname, lastname, salary);
    }

    private String firstname;
    private String lastname;
    private double salary;





    private Employee() {
    }

    private Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    private Employee(String firstname, double salary) {
        this.firstname = firstname;
        this.salary = salary;
    }

    private Employee(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name is " + this.firstname + "  salary is " + this.salary;
    }

}
