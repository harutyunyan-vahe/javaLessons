package com.vahe.flatMap;

import com.vahe.Car;
import com.vahe.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        Employee e1 = new Employee("vahe", 22, List.of(new Car("bmw", 2000), new Car("mercedes", 2010)));
        Employee e2 = new Employee("karen", 30, List.of(new Car("Volvo", 1990), new Car("Tesla", 2020)));

        List<Employee> employees = List.of(e1, e2);

        employees.stream()
                .flatMap(e -> e.getCars().stream())
               // .flatMap( car -> car.getColors().stream() )
                //.filter(color -> "black".equals(color))
                .forEach( carsList -> {
                    System.out.println(carsList);
                });



        //[[1, 2], [4, 5]] [ 1, 2, 4, 5]
//        List<Car> allCars = new ArrayList<>();
//
//        for (List<Car> cur : cars) {
//            allCars.addAll(cur);
//        }





//        List<Car> collect = employees.stream()
//                .flatMap(e -> e.getCars().stream())
//                .collect(Collectors.toList());

    }
}
