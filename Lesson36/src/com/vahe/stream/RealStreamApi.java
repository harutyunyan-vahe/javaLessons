package com.vahe.stream;


import com.vahe.Car;

import java.util.List;
import java.util.stream.Collectors;

public class RealStreamApi {

    public static void main(String[] args) {


        List<Car> cars = List.of(new Car("BFerrari", 2010),
                new Car("Volvo", 2020),
                new Car("BMW", 2015));


//        Stream<Car> stream = cars.stream();
//
//        Stream<Car> carStream = stream.filter((Car c) -> {
//            return c.getYear() > 2010;
//        });
//
//        List<Car> filterdCars = carStream.collect(Collectors.toList());

        List<Car> filterdCars = cars.stream()
                .filter(c -> c.getYear() > 2010)
                .collect(Collectors.toList());

//        List<String> brands = cars.stream()
//                .filter(c -> c.getYear() > 2010)
//                .filter(c -> c.getBrand().startsWith("B"))
//                .map((Car c) -> c.getBrand())
//                .collect(Collectors.toList());
//
//        System.out.println(brands);
//        for(String b : brands){
//            System.out.println(b);
//        }


       cars.stream()
                .filter(c -> c.getYear() > 2010)
                .filter(c -> c.getBrand().startsWith("B"))
                .map((Car c) -> c.getBrand())
                .forEach(System.out::println);

    }
}
