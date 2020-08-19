package com.vahe;

public interface Singer {
    String sing();
    void dance();

    default void doWork() {
        System.out.println("Singer is  working .... ");
    }


}
