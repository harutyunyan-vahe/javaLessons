package com.vahe;

public interface AB extends A, B {
    static int plus(int a, int b) {
        return a + b;
    }

    void ab();
}
