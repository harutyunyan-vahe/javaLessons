package com.vahe;

public abstract class Shape {
    private String color;

    public abstract double calculateArea();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
