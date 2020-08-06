package com.vahe;

import java.io.IOException;

public class MyMain {

    public static void main(String[] args) throws IOException {
//        Date d = new Date();
//        Calendar a =

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = r1;


        Object o1 = new Rectangle(4, 5);


//        String kk = r3.toString();


//        if (r1 == r3) {
//            System.out.println("Havasar en ");
//        } else {
//            System.out.println("havasar chen ");
//        }


        if (r1.equals(r2)) {

            System.out.println("Havasar en ");
        } else {
            System.out.println("havasar chen ");
        }


        // Employee e = new Employee();
        // System.out.println(e);

        String g = "test";
        String g2 = "test";

        if (g.equals(g2)) {

            System.out.println("String havasar en ");
        }


        Manager manager = new Manager("vahe", 333, 22);
        Employee karen = new Employee("kare", 33);
        MyMain.test(karen);


    }

    public static void test(Employee e) {

        if (e instanceof Manager) {
            Manager man = (Manager) e;
            System.out.println("Bonus " + man.getBonus());
        } else {
            System.out.println("manager cher, hetevabar bonus chuni ");
        }

    }
}
