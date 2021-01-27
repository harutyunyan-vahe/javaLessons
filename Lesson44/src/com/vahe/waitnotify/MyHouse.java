package com.vahe.waitnotify;

public class MyHouse {
    private boolean pizzaArrived = false;

    public synchronized void eatPizza() throws InterruptedException {
        System.out.println("trying to eat");
        while (!pizzaArrived) {
            wait();
        }
        if (pizzaArrived) {
            System.out.println("yumyum..");
        } else {
            System.out.println("NOTHNING TO EAT");
        }
    }

    public synchronized void deliverPizza() {
        System.out.println("new Pizza");
        this.pizzaArrived = true;
        notifyAll();// you will get dead lock if notifyAll is not called

    }
}
