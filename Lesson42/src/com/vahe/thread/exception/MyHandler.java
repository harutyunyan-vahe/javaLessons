package com.vahe.thread.exception;

import java.sql.SQLOutput;

public class MyHandler {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            if (2 > 1) {
                throw new IllegalStateException();
            }
        });



        t.setUncaughtExceptionHandler((thread, ex) -> {
            System.out.println(ex.getMessage());
            System.out.println("something is wrong in app");
//            System.out.println(t1.getName());
//            e.printStackTrace();
        });
        t.start();
    }
}
