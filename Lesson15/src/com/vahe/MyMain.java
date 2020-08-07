package com.vahe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class MyMain {

    public static void main(String[] args) {


        //Employee e = new Employee("vahe", 222);

        // String str = e.toString();

        // System.out.println(e);


        //static factory

//        Employee aghas = Employee.

//
//        LocalDate date = LocalDate.of(1990, 2, 26);
//
//
//
//        Employee e2 = Employee.withFirstname("vahe");//new Employee("vahe");
//        Employee e1 = Employee.withFirstnameAndSalary("vahe", 222);// new Employee("vahe", 222);
//        Employee e3 = Employee.withAll("vahe", "harutyna", 222);//new Employee("vahe", "harutyna", 222);
//        Employee e4 = Employee.empty();
//
//
////        e1.setSalary(500);
//
////        String k1 = "va";
////        String k2 = "he";
//
//        String s1 = "vahe";
//        String s2 = "vahe";
//
//        //immutable
//        String substring = s1.substring(0, 2);
//
//        String s1Upper = s1.toUpperCase();
//        System.out.println(s1);
//
//        if (s1 == s2) {
//            System.out.println("Havasar en ");
//        } else {
//            System.out.println("havasar chen");
//        }


        Rectangle r1 = new Rectangle("black", 2, 4);
        Rectangle r2 = new Rectangle("black", 2, 10);
        Rectangle r3 = new Rectangle("black", 2, 5);
        double maxArea = maxShapeArea(r1, r2, r3);
        System.out.println(maxArea);

        Circle c1 = new Circle("black", 4);
        Circle c2 = new Circle("black", 1);
        Circle c3 = new Circle("black", 5);

        Cube cube = new Cube(100, "green");

        double maxCircle = maxShapeArea(r1, r2, r3);


        System.out.println(maxCircle);
//        Shape sh = new Shape("red");

//        sh.calculateArea();

    }

    public static double maxShapeArea(Shape sh1, Shape sh2, Shape sh3) {
        double max = sh1.calculateArea();
        if (sh2.calculateArea() > max) {
            max = sh2.calculateArea();
        }
        if (sh3.calculateArea() > max) {
            max = sh3.calculateArea();
        }
        return max;
    }


//    public static double maxCubeArea(Cube c1, Cube c2, Cube c3) {
//        double max = c1.calculateArea();
//        if (c2.calculateArea() > max) {
//            max = c2.calculateArea();
//        }
//        if (c3.calculateArea() > max) {
//            max = c3.calculateArea();
//        }
//        return max;
//    }

//    public static double maxCircleArea(Circle c1, Circle c2, Circle c3) {
//        double max = c1.calculateArea();
//        if (c2.calculateArea() > max) {
//            max = c2.calculateArea();
//        }
//
//        if (c3.calculateArea() > max) {
//            max = c3.calculateArea();
//        }
//        return max;
//    }

//    public static double maxRectangleArea(Rectangle r1, Rectangle r2, Rectangle r3) {
//        double max = r1.calculateArea();
//
//        if (r2.calculateArea() > max) {
//            max = r2.calculateArea();
//        }
//
//        if (r3.calculateArea() > max) {
//            max = r3.calculateArea();
//        }
//        return max;
//    }
}
