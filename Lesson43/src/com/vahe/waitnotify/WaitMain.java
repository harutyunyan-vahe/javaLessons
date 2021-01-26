package com.vahe.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class WaitMain {

    public static final int THREAD_COUNT = 10;

    public static void main(String[] args) throws Exception {

        MyHouse myHouse = new MyHouse();


        List<Thread> eatThreads = getEatThreads(myHouse);

        for (Thread eatThread : eatThreads) {
            eatThread.start();
        }

        List<Thread> deliverThreads = getDeliverThreads(myHouse);
        for (Thread deliverThread : deliverThreads) {
            deliverThread.start();
        }


    }

    private static List<Thread> getEatThreads(MyHouse myHouse) {
        List<Thread> eatThreads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            eatThreads.add(new Thread(() -> {
                try {
                    myHouse.eatPizza();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }));
        }
        return eatThreads;
    }

    private static List<Thread> getDeliverThreads(MyHouse myHouse) {
        List<Thread> deliverThreads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            deliverThreads.add(new Thread(() -> {
                myHouse.pizzaGuy();
            }));
        }
        return deliverThreads;
    }


}
