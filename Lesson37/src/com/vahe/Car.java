package com.vahe;

import java.util.Comparator;
import java.util.Objects;

public class Car /*implements Comparable<Car>*/ {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return year == car.year &&
//                Objects.equals(brand, car.brand);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, year);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        return Integer.compare(this.getYear(), o.getYear());
//    }
}
