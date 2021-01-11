package com.vahe.limit;

import com.vahe.Employee;
import com.vahe.optinal.MyOptional;

import java.util.List;
import java.util.Optional;

public class Limit {

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("vahe", 12),
                new Employee("karen", 22),
                new Employee("vahe", 21)
        );

        /*Optional<Employee> e1 =*/

        Employee employee = employees.stream()
                .filter(e -> e.getAge() > 180)
                .findFirst()
                .orElse(new Employee("vahe", 222));


        Optional<String> vaheOptinal = Optional.of("vahe");




//        e1.ifPresent(e -> {
//            System.out.println(e);
//        });
//
//        if (e1.isPresent()) {
//            Employee employee = e1.get();
//            System.out.println(employee);
//
//        }

//       // if (e1 != null) {
//            System.out.println(e1.getAge());
//        //}

//        Employee e2 = employees.stream()
//                .filter(e -> e.getAge() > 18)
//                .findFirst();

    }
}
