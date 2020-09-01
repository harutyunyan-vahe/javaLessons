package com.vahe;

public class GenericPair <T extends Comparable> {

    // static T k;

    private T first;
    private T second;

    public GenericPair(T first, T second) {
        //T gg = new T();
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
