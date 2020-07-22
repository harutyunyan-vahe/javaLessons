package com.vahe.model;

public class Employee {


    // private , miayn ask classum
    // default (package private), classum, bolor en classnerum vornq es packigic en
    // protected //
    //public // bololor
    public String firstname;
    public String lastname;
    public double salary;

//    public Employee() {
//    }

    public Employee(String f, String l, double s) {
        this.firstname = f;
        this.lastname = l;
        this.salary = s;
    }

    public Employee(String f, String l) {
        this.firstname = f;
        this.lastname = l;
    }

    public static String getFullName(Employee employee) {
        String fullname = employee.firstname + " " + employee.lastname;
        return fullname;
    }

    public String getFullName() {
        String fullname = this.firstname + " " + this.lastname;
        return fullname;
    }

    public void increaseSalary(double delta) {
        this.salary += delta;
    }

//    public static void increaseSalarySt(Employee e, double deleta) {
//        e.salary = e.salary + deleta;
//    }

    public String getFullInfo() {
        String info = this.firstname + " " + this.lastname + " " + this.salary;
        return info;
    }


}
