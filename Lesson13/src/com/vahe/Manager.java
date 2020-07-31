package com.vahe;

public class Manager extends Employee {

    public static Car car = new Car("Black", "Linkoln");

    private double bonus;

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}
