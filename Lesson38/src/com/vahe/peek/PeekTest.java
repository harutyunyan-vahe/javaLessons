package com.vahe.peek;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekTest {
    public static void main(String[] args) {

        List<String> collect = Stream.of("vahe", "karen", "hayk")
                .filter(e -> e.contains("e"))
                .peek(System.out::println)
                .filter(e -> e.length() == 4)
                .collect(Collectors.toList());


    }
}
