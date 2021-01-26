package com.vahe.imutable;

public final class ImutableEmployee {

    private final String name;
    private final int age;

    public ImutableEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
