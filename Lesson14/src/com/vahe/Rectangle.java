package com.vahe;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Rectangle)) {
//            return false;
//        }
//        Rectangle other = (Rectangle) obj;
//        return this.width == other.width && this.height == other.height;
//    }

    public boolean isHavasarEn(Rectangle other) {
        return this.width == other.width && this.height == other.height;
//        if (this.width == other.width && this.height == other.height) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
