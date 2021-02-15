package com.vahe;

import com.vahe.lombok.Car;
import com.vahe.lombok.Employee;

public class MyMain {

    public static void main(String[] args) {

//        AdviceService adviceService = new AdviceService(new WeatherServiceImpl());
//
//        String advice = adviceService.getAdvice("Moscow");
//        System.out.println(advice);

//        Employee employee = new Employee("vahe", 12);
//
//
//        employee.getName();

        Car bmw = new Car("BMW", 2020);

        bmw.getBrand();

        Employee vahe1 = new Employee("vahe", "har", 30);
        Employee vahe2 = new Employee("vahe", "har", 33);

        if (vahe1.equals(vahe2)) {
            System.out.println("Havasar en ");
        }
    }
}
