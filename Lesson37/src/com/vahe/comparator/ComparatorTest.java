package com.vahe.comparator;

import com.vahe.Car;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        List<Car> cars = List.of(new Car("bmw", 2000),
                new Car("volvo", 2010));


//        Comparator<Car> carComparatorByYear = (c1, c2) -> {
//            return c1.getYear().comapreTo(c2.getYear());
//        };

        Comparator<Car> carComparatorByBrand = (c1, c2) -> {
            return c1.getBrand().compareTo(c2.getBrand());
        };

        Comparator<Car> carComparator = negate(carComparatorByBrand);
//        Comparator<Car> carComparatorByBrand2 = (c1, c2) -> {
//            return -1 * (c1.getBrand().compareTo(c2.getBrand()));
//        };


        Collections.sort(cars, Comparator.comparing(Car::getBrand)
                .reversed());
//        Collections.sort(cars, (c1, c2) -> {
//            return c1.getBrand().compareTo(c2.getBrand());
//        });
    }

    public static Comparator<Car> negate(Comparator<Car> carComparator) {
        return (o1, o2) -> {
            return -1 * carComparator.compare(o1, o2);
        };
    }
}
