package com.vahe;

public class Cube extends Shape {
    private double width;


    public Cube(double width, String color) {
        super(color);
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
