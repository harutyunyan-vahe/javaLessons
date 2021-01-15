package com.vahe;

import com.vahe.exersise.ModelCreator;
import com.vahe.model.Car;
import com.vahe.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMain {

    public static void main(String[] args) {

        List<Employee> emps = ModelCreator.getEmps();

        int totalKilomoters = emps.stream()
                .flatMap(emp -> emp.getCars().stream())
                .mapToInt(Car::getKl)
                .sum();

        System.out.println(totalKilomoters);

        //50 barcr mec mardkanc tariqnery
        List<String> firstnames = emps.stream()
                .filter(e -> e.getAge() > 50)
                .map(Employee::getFirstname)
                .collect(Collectors.toList());
        System.out.println(firstnames);

        //50 barcr mec mardkanc mijin tariqy


        /*OptionalDouble average =*/
        emps.stream()
                .filter(e -> e.getAge() > 50)
                .mapToInt(Employee::getAge)
                .average()
                .ifPresent(System.out::println);


        //50 barcr mec mardkanc (sortavorac yst tariqi) araji 2in
        List<Employee> empsWithLimi = emps.stream()
                .filter(e -> e.getAge() > 50)
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(empsWithLimi);


        // gtnel amenashaty qshac meqenan
        emps.stream()
                .flatMap(e -> e.getCars().stream())
                .max(Comparator.comparing(Car::getKl))
                .ifPresent(System.out::println);


        // brand  erkarutyny list
        // List<Integer>
        emps.stream()
                .flatMap(e -> e.getCars().stream())
                .mapToInt(car -> car.getBrand().length())
                .sorted()
                // .mapToInt(String::length)
                .forEach(System.out::println);

        //       age
        // Map<Integer, List<Employee>>

        Map<Integer, List<Employee>> ageToEmpList = emps.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(ageToEmpList);

        Map<Integer, Set<Employee>> ageToEmpSet = emps.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));

        Map<Integer, Long> ageToCount = emps.stream()
                .collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

        System.out.println(ageToCount);

        Stream<Employee> stream = emps.stream();

//        stream.collect(Collectors.toList());
//        stream.forEach(System.out::println);

//        Stream.of(2, 4, 5)
//                .filter(e -> {
//                    System.out.println("test");
//                    return  e > 1;
//                });

//        IntStream.of(1, 23, 4)
//                .boxed() // Stream<Interger>
//                .collect(Collectors.toList());


//        average.ifPresent(System.out::println);

// Functinal interface should has only 1 abstract method
        //Consumer (foreach, ifPresent, void accept(T)), Function(map, flatMap) T apply(R) , Predicate (filter, boolean test(T)),
        // Runnable( void run() ,   new Thread())
        //Supplier (T get() -- Stream.generege(),Stream.interate() )





    }
}
