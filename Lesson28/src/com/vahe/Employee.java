package com.vahe;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String lastname;


    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getLastname() {
        return lastname;
    }

//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

//    @Override
//    public int hashCode() {
//        return name.hashCode() + lastname.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        Employee emp = (Employee) object;
//        return name.equals(emp.name) && lastname.equals(emp.lastname);
//    }


}
