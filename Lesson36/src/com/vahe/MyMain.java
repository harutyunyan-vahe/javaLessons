package com.vahe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MyMain {

    public static void main(String[] args) {

        Stream.generate(() -> 1)
        //.limit(10)
        .forEach(System.out::println);

        Stream.iterate(40, n -> n + 2).limit(20)
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));
    }





}
