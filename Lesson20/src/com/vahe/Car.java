package com.vahe;

public class Car {

    private int km;
    private String name;

    public Car(int km, String name) {
        this.km = km;
        this.name = name;
    }

    public void drive(int k) throws CarDriveException{
        if (k < 0) {
            throw new CarDriveException();
        }
        this.km = this.km + k;
    }
}
