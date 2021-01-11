package com.vahe.groupBy;

import com.vahe.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("vahe", 20),
                new Employee("karen", 22),
                new Employee("hayk", 22),
                new Employee("vahe", 21),
                new Employee("aram", 21)
        );

        Map<Integer, List<Employee>> ageMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));


        System.out.println(ageMap);



        Map<Integer, Set<Employee>> ageMap2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));
        System.out.println(ageMap2);
//
//
        Map<Integer, Long> counting = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

        System.out.println(counting);


    }
}
