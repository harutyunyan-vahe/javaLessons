package com.vahe;

public interface A {

    void a();

    default void a2() {
        System.out.println("a222");
    }
}
