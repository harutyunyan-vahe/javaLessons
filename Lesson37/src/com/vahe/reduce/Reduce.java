package com.vahe.reduce;

import com.vahe.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 4, 6, 7);

        Optional<Integer> reduceOp = numbers
                .reduce((a, b) -> {
                    return a + b;
                });


        reduceOp.ifPresent(System.out::println);


    }
}
