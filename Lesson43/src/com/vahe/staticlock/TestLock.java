package com.vahe.staticlock;

public class TestLock {

    private static int COUNT = 0;

    public synchronized static void increment() {
        TestLock.COUNT++;
    }

    public void increment2() {
        Class<TestLock> testLockClass = TestLock.class;
        synchronized (testLockClass) {
            TestLock.COUNT++;
        }
    }
}
