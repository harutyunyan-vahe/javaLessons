package com.vahe;

public class Circle {
    private static final double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return this.radius * PI * 2;
    }
}
