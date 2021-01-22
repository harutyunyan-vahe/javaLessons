package com.vahe;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

public class MyMain {

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Test 1 " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Test 2 " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Test 3 " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("End " + Thread.currentThread().getName());
        long end = System.currentTimeMillis();
        System.out.println("Took " + (end - start) + " millisecons");


    }
}
