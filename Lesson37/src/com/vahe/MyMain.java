package com.vahe;

import java.util.List;
import java.util.stream.Collectors;

public class MyMain {

    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("vahe", 20),
                new Employee("karen", 22),
                new Employee("vahe1", 21),
                new Employee("vahe2", 21),
                new Employee("vahe3", 21)
        );


        List<Employee> collect = employees.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
