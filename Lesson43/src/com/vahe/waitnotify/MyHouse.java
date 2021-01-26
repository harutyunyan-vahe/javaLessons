package com.vahe.waitnotify;

public class MyHouse {
    private boolean pizzaArrived = false;

    public synchronized void eatPizza() throws InterruptedException {
//        while (!pizzaArrived) {
//
//            wait();
//        }
        if (pizzaArrived) {
            System.out.println("yumyum..");
        } else {
            System.out.println("NOTHNING TO EAT");
        }
    }

    public synchronized void pizzaGuy() {
        System.out.println("new Pizza");
        this.pizzaArrived = true;
        notifyAll();

    }
}
