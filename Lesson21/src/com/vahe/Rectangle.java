package com.vahe;

public class Rectangle implements MyCompariable {

    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    public double getArea() {
        return this.heigth * this.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public int compare(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.getArea() > rectangle.getArea()) {
            return 1;
        }
        if (this.getArea() == rectangle.getArea()) {
            return 0;
        }
        return -1;
    }
}
