package com.vahe;


public class Manager  extends Employee{
    private double bonus;

    public Manager(String firstname, String lastname, double salary, double bonus) {
        super(firstname, lastname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        System.out.println(this.firstname);
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //overload


    //override

    //@Override
    public double getSalary(){
        return super.getSalary() + this.bonus;
    }
}

