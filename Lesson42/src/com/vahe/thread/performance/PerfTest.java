package com.vahe.thread.performance;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PerfTest {

    public static final int COUNT = 15;

    public static void main(String[] args) {

        //testSlowWith1Thread();
        //getInfoFromInternetSlowMethod();
        testFastWith15Thread();
    }


    private static void testSlowWith1Thread() {
        for (int i = 0; i < COUNT; i++) {

            getInfoFromInternetSlowMethod();
        }
    }

    private static void testFastWith15Thread() {
        Thread[] threads = new Thread[COUNT];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                PerfTest.getInfoFromInternetSlowMethod();
            });
        }

        for (Thread cur : threads) {
            cur.start();
        }

    }

    public static void getInfoFromInternetSlowMethod() {
        int timeToWait = new Random().nextInt() % 10;
        timeToWait = Math.abs(timeToWait);// 0 - 10 int
        try {

            TimeUnit.SECONDS.sleep(timeToWait);
            System.out.println(" " + Thread.currentThread().getName() + "  Get Info   in " + timeToWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
