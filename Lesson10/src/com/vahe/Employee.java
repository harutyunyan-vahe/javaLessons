package com.vahe;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;
    private double salary;


    public Employee(String f, String l, double s, int age) {
        this.firstname = f;
        this.lastname = l;
//        if (s > 0) {
//            this.salary = s;
//        } else {
//            System.out.println("Error salary could not be negative");
//        }
        this.setSalary(s);
        this.age = age;
    }

    public int getAge() {
        return Double.valueOf(this.age).intValue();
    }

    public void setFirstname(String f) {
       // if (!f.contains("@")) {
            this.firstname = f;
        //}
     }

    public String getFirstname() {
        return this.firstname;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Error salary could not be negative");
        }
    }

//    public Employee(String f, String l) {
//        this.firstname = f;
//        this.lastname = l;
////        this.salary = s;
//    }

    public String getFullname() {
        return this.firstname + "  " + this.lastname;
    }

    public void increaseSalary(double delta) {
        this.salary = this.salary + delta;
    }


    private int getBirthYear(){
        return 2020 - age;
    }

    public String getFullInfo() {
        return this.getBirthYear() + "  " +  this.firstname + "  " + this.lastname + " " + this.salary;
    }

    public double getPension() {
        if (this.age > 60) {
            return this.salary / 10;
        }
        return 0;
    }


//    public Employee() {
//
//    }

}
