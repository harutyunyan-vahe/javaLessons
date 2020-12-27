package com.vahe;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class MyMain {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "vahe");

        map.put(20, "garik");
        map.put(21, "varazdat");


        TreeMap<Employee, String> empMap = new TreeMap<>(new EmployeeSalaryComparator());


        List<Employee> employees = List.of(new Employee("vahe", 20), new Employee("kare", 20));
        Collections.sort(employees);
        Collections.sort(employees, new EmployeeSalaryComparator());


//        TreeMap<LocalDate, String> mapOfDate = new TreeMap<>();
//
////        empMap.put(new Employee("vahe", 30), "vahe");


    }
}
