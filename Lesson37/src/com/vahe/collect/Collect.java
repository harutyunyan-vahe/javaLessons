package com.vahe.collect;

import com.vahe.Employee;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("vahe", 20),
                new Employee("karen", 22),
                new Employee("vahe", 21)
        );

//        Iterator<Employee> iterator = employees.stream()
//                .iterator();

        List<Employee> list = employees.stream()
                .collect(toList());

        Set<Employee> set = employees.stream()
                .collect(toSet());

//        employees.stream()
//                .collect(toCollection(TreeSet::new));


        String joinedString = Stream.of("vahe", "har", "aaa")
                .collect(Collectors.joining(" , ", " [ ", " ]"));
        System.out.println(joinedString);

        IntSummaryStatistics intSummaryStatistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());
    }
}
