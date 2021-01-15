package com.vahe.model;

public class Car {
    private String brand;
    private int kl;


    public Car(String brand, int kl) {
        this.brand = brand;
        this.kl = kl;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKl() {
        return kl;
    }

    public void setKl(int kl) {
        this.kl = kl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", kl=" + kl +
                '}';
    }
}
