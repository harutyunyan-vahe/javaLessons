package com.vahe.stream.filter;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T obj);
}
