package com.vahe;

public class Car {
    private static int COUNT = 0;

//    public static Car PRESIDENT_CAR = new Car("Black", "Linkoln");

    public static int getObjectCount() {
        return Car.COUNT;
    }

    private String color;
    private String brand;

    public Car(String color, String brand) {
        Car.COUNT++;
        this.color = color;
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
