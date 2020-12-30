package com.vahe.homeworkcheck;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override

    public int compare(Employee e1, Employee e2) {

        return Integer.compare(e1.getAge(), e2.getAge());
    }


}
