package com.vahe.paralel;

// interview questions
public class TestParalel {

//    public  void test1() {
//        synchronized (this) {
//
//        }
//    }
//
//    public  void test2() {
//        synchronized (this) {
//
//        }
//    }


    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void test1() {
        synchronized (lock1) {

        }
    }

    public void test2() {
        synchronized (lock2) {

        }
    }


}
