package com.vahe.optinal;

import java.util.function.Consumer;

public class MyOptional<T> {

    private T value;

    public boolean isPresent(){
        return value != null;
    }

    public T get(){
        return value;
    }

    public void ifPresent(Consumer<T> consumer) {
        if(isPresent()){
            consumer.accept(this.value);
        }
    }
}
