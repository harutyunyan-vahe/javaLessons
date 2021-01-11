package com.vahe.toMap;

import com.vahe.Car;
import com.vahe.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMap {


    public static void main(String[] args) {

//        List<Integer> collect1 = Stream.of(1, 2, 2, 4)
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);

        List<Car> distinctCars = Stream.of(new Car("bmw", 2003), new Car("bmw", 2003))
                .distinct()
//                .sorted((o1, o2) -> {
//                    return o1.getBrand().compareTo(o2.getBrand());
//                })
                .sorted(Comparator.comparing(Car::getBrand))
                .collect(Collectors.toList());

        System.out.println(distinctCars);

        List<Employee> employees = List.of(
                new Employee("vahe", 20),
                new Employee("karen", 22),
                new Employee("vahe", 21),
                new Employee("Gurgen", 25)
        );


        Map<Integer, String> ageToName = employees.stream()
                .collect(Collectors.toMap(Employee::getAge, Employee::getName));

        Map<Integer, Employee> ageToEmpoyee = employees.stream()
                .collect(Collectors.toMap(Employee::getAge, Function.identity()));

        System.out.println(ageToName);


    }

    public Map<Integer, String> toHashMap(List<Employee> employees) {
        Map<Integer, String> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.getAge(), e.getName());
        }
        return map;
    }

    public Map<Integer, String> toHashMap(List<Employee> employees, Function<Employee, Integer> keyMapper,
                                          Function<Employee, String> valueMapper) {
        Map<Integer, String> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(keyMapper.apply(e), valueMapper.apply(e));
        }
        return map;
    }
}
