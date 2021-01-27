package com.vahe.state;

import java.util.concurrent.TimeUnit;

public class StateTest {

//    New
//    Runnable
//    Blocked
//    Waiting
//    Timed waiting
//    Terminated


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            for (int i = 0; i < 10_000_000; i++) {
                //System.out.println(i);
            }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(thread.getState());

    }
}
