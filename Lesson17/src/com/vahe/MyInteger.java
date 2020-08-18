package com.vahe;

public class MyInteger {

    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

    private final int value;




    private MyInteger(int vale) {
        this.value = vale;
    }

    public int getValue() {
        return value;
    }
}
