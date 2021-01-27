package com.vahe.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyExecutors {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        // Executors.newSingleThreadExecutor();// Executors.newFixedThreadPool(1);

        for (int i = 0; i < 100; i++) {

            executorService.submit(() -> {

                try {
                    System.out.println("Start");
                    System.out.println(Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        TimeUnit.SECONDS.sleep(15);

    }


}
