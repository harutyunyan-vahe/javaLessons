package com.vahe;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMain {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("vahe", "har", 22),
                new Employee("karen", "martirosyan", 23));

       Map<String, Integer> map =  employees.stream()
                .collect(Collectors.toMap(Employee::getFirstname, Employee::getAge));

        Map<String, List<Employee>> mapByGroup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getFirstname));


        boolean match = Stream.of("cc", "gg", "ttt")
                .anyMatch(e -> e.contains("a"));

        System.out.println(match);

    }
}
