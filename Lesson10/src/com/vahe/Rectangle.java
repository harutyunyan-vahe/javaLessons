package com.vahe;

public class Rectangle {

    private double with;
    private double height;

    public Rectangle(double with, double height) {
        this.setHeight(height);
        this.setWith(with);
//        this.with = with;
//        this.height = height;
    }


    public double calculateArea() {
        return this.height * this.with;
    }

    public double calculateParameter() {
        return 2 * (this.height + this.with);
    }


    public double getWith() {
        return this.with;
    }

    public void setWith(double with) {
        if (with > 0) {
            this.with = with;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
}
