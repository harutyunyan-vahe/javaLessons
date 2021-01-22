package com.vahe.thread.join;

import java.util.concurrent.TimeUnit;

public class JoinTest {


    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Test thread  1");
                TimeUnit.SECONDS.sleep(500);
                System.out.println("Test  thread 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        System.out.println("main thread 1");

        thread.join();//wait until thread is finished

        System.out.println("main thread 2");
    }
}
