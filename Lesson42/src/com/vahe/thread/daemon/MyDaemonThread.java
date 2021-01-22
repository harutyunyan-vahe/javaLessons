package com.vahe.thread.daemon;

import java.util.concurrent.TimeUnit;

public class MyDaemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("test Deemon");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //thread.setDaemon(true);
        thread.start();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("end");

    }

}
