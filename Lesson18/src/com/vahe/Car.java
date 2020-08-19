package com.vahe;

public class Car implements MyComparable{

    private int year;
    private String brand;


    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    @Override
    public int compare(Object  obj) {
        Car car = (Car) obj;
        if (this.year > car.year) {
            return 1;
        }
        if (this.year < car.year) {
            return -1;
        }
        return 0;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }
}
