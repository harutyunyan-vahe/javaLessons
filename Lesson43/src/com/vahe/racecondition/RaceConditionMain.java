package com.vahe.racecondition;

import com.vahe.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionMain {

    public static final int THREAD_COUNT = 1000;
    public static final int DRIVE_PER_ITERATION = 1000;

    public static void main(String[] args) throws InterruptedException {
        testRaceCondition();
    }

    public static void testRaceCondition() throws InterruptedException {

        Car car = new Car();
        List<Thread> threadList = getThreads(car);
        threadList.forEach(Thread::start);

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("Actual is " + car.getKilometers());
        System.out.println("Should be " + THREAD_COUNT * DRIVE_PER_ITERATION);
    }

    private static List<Thread> getThreads(Car car) {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadList.add(new Thread(() -> {

                for (int j = 0; j < RaceConditionMain.DRIVE_PER_ITERATION; j++) {

                    car.driveReentrantLock();
                    //car.test();
                }
            }));
        }
        return threadList;
    }

}
