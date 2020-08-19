package com.vahe;

public class Rectangle implements MyComparable{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
//    int compare(Object obj);

    @Override
    public int compare(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.area() > rectangle.area()) {
            return 1;
        }
        if (this.area() < rectangle.area()) {
            return -1;
        }
        return 0;
    }

    public double area() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
