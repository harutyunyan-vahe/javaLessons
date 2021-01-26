package com.vahe.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCar {
    private AtomicInteger kilometers = new AtomicInteger(0);

    public AtomicCar() {
    }

    public void drive() {
        this.kilometers.incrementAndGet();

    }

    public int getKilometers() {
        return kilometers.get();
    }

}
