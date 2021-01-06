package com.vahe.stream.foreach;

import com.vahe.Car;

import java.util.List;

public class StreamForeach {

    public static void main(String[] args) {

        List<Car> cars = List.of(new Car("BMW", 2010),
                new Car("Volvo", 2020),
                new Car("BMW", 2015));


//        for (Car c : cars) {
//            System.out.println(c.getBrand());
//            //HttClinet.get(c.getName);
//        }
//
//        for (Car c : cars) {
//            //HttClinet.get(c.getName);
//        }

        forach(cars, (Car c) -> {
            System.out.println(c.getBrand());
        });

        forach(cars, (Car c) -> {
            //HttClinet.get(c.getName);
        });
    }

    public static void printCars(List<Car> cars) {
        for (Car c : cars) {
            System.out.println(c.getBrand());
        }
    }

    public static void sentCarNames(List<Car> cars) {
        for (Car c : cars) {
            //HttpClinet.post(c.getCarName);
        }
    }

    public static void forachCar(List<Car> cars, CarConsumer carConsumer) {
        for (Car c : cars) {
            carConsumer.accept(c);
            //HttpClinet.post(c.getCarName);
        }
    }


    /**
     * the best
     * @param cars
     * @param consumer
     * @param <T>
     */
    public static <T> void forach(List<T> cars, MyConsumer<T> consumer) {
        for (T c : cars) {
            consumer.accept(c);

        }
    }


}
