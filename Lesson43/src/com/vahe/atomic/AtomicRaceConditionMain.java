package com.vahe.atomic;

import com.vahe.racecondition.RaceConditionMain;

import java.util.ArrayList;
import java.util.List;

public class AtomicRaceConditionMain {

    public static final int THREAD_COUNT = 1000;
    public static final int PER_ITERATION = 1000;

    public static void main(String[] args) throws Exception {
        testRaceCondition();
    }

    public static void testRaceCondition() throws Exception {

        AtomicCar car = new AtomicCar();
        List<Thread> threadList = getThreads(car);
        threadList.forEach(Thread::start);
        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("Actual is " + car.getKilometers());
        System.out.println("Should be " + THREAD_COUNT * PER_ITERATION);
    }

    private static List<Thread> getThreads(AtomicCar car) {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadList.add(new Thread(() -> {
                for (int j = 0; j < RaceConditionMain.DRIVE_PER_ITERATION; j++) {
                    car.drive();
                }
            }));
        }
        return threadList;
    }
}
