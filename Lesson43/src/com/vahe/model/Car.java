package com.vahe.model;

import java.util.concurrent.locks.ReentrantLock;

public class Car {
    private int kilometers = 0;

    private Object lock;
    private ReentrantLock reentrantLock;

    public Car() {
        this.lock = new Object();
        this.reentrantLock = new ReentrantLock();
    }

    public void drive() {
        this.kilometers = this.kilometers + 1;
        // load memeory to cpu register
        // regier  + 1
        // write

    }

    public synchronized void driveSync() {
        this.kilometers++;

        // load memeory to cpu register
        // regier  + 1
        // write
    }

    public void driveSyncWithThis() {
        synchronized (this) {
            this.kilometers++;

            // load memeory to cpu register
            // regier  + 1
            // write
        }
    }

    public void driveWithLockObject() {

        // System.out.println("test 1");
        synchronized (lock) {
            this.kilometers++;
        }

        // System.out.println("test 2");
        //System.out.println("test 3");
    }

    public void test() {
        synchronized (lock) {
            System.out.println("testtt est");
        }
    }

    public void driveReentrantLock() {

        reentrantLock.lock();
        try {
            this.kilometers++;

        } finally {
            reentrantLock.unlock();
        }

    }


    public int getKilometers() {
        return kilometers;
    }


}
