package com.vahe.waitnotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyHouseReentraLock {

    private boolean pizzaArrived = false;
    private ReentrantLock reentrantLock;
    private Condition condition;

    public MyHouseReentraLock() {
        this.reentrantLock = new ReentrantLock();
        this.condition = this.reentrantLock.newCondition();

    }

    public void eatPizza() throws InterruptedException {
        try {
            reentrantLock.lock();
           // System.out.println("trying to eat");
            while (!pizzaArrived) {
                this.condition.await();
            }
            if (pizzaArrived) {
                System.out.println("yumyum..");
            } else {
                System.out.println("NOTHNING TO EAT");
            }
        } finally {
            reentrantLock.unlock();
        }

    }

    public void deliverPizza() {
        try {
            reentrantLock.lock();
           // System.out.println("new Pizza");
            this.pizzaArrived = true;
            this.condition.signalAll();// you will get dead lock if notifyAll is not called
        } finally {
            reentrantLock.unlock();
        }


    }
}
