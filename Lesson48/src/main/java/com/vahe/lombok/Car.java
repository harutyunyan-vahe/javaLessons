package com.vahe.lombok;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Car {

    @Getter
    @Setter
    private String brand;

    @Getter
    @Setter
    private int km;

    public Car(String brand, int km) {
        this.brand = brand;
        this.km = km;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return km == car.km &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, km);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", km=" + km +
                '}';
    }




}
