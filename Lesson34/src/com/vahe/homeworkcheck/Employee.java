package com.vahe.homeworkcheck;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;

    public Employee(String first, String last, int a) {
        this.firstname = first;
        this.lastname = last;
        this.age = a;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String first) {
        this.firstname = first;

    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String last) {
        this.lastname = last;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.firstname);
        return sb.append(" ").append(this.lastname).append(" ").append(age).toString();
    }
}
