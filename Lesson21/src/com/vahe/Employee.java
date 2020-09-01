package com.vahe;

public class Employee  implements Comparable, MyCompariable{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Object e) {
        Employee employee = (Employee)e;
        if (this.age > employee.age) {
            return 1;
        }
        if (this.age == employee.age) {
            return 0;
        }
         return -1;
    }


    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee)o;
        if (this.age > employee.age) {
            return 1;
        }
        if (this.age == employee.age) {
            return 0;
        }
        return -1;
    }
}
