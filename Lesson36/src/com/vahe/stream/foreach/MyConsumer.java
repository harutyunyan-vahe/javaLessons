package com.vahe.stream.foreach;

import com.vahe.Car;

public interface MyConsumer<T> {

    void accept(T t);
}
