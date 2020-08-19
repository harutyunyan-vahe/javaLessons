package com.vahe;

public class Employee extends Human implements Runner, Singer, MyComparable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public void doWork(){
//        System.out.println("Hello ");
//        super.doWork();
//        Singer.super.doWork();
//    }

    @Override
    public int compare(Object obj) {
        Employee e = (Employee) obj;
        if (this.salary > e.salary) {
            return 1;
        }
        if (this.salary < e.salary) {
            return -1;
        }
        return 0;
    }

//    @Override
//    public void doWork() {
//        System.out.println("Employee is working ...");
//    }


    @Override
    public void run() {
        System.out.println("Employ is running ");
    }

    @Override
    public String sing() {
        System.out.println("Singing jazz");
        return "jazz";
    }

    @Override
    public void dance() {
        System.out.println("I am dancing");
    }
}
