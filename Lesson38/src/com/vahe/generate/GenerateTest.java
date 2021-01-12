package com.vahe.generate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateTest {
    public static void main(String[] args) {
//         Stream.generate(() -> 1)
//                .limit(10)
//                .forEach(System.out::println);

//        System.out.println(collect);

        System.out.println("-------------------");
        //infinit , ansahmanapak
//        Stream.iterate(1, number -> number + 2)
//                .limit(10)
//                .forEach(System.out::println);
//
//        System.out.println("-------------------");
//
        Stream.iterate(1, e -> e != 100, number -> number + 1)
                //.limit(10)
                .forEach(System.out::println);


        Stream.iterate("vahe", e -> e.length() < 7, name -> name + "W")
                //.limit(10)
                .forEach(System.out::println);
    }

}
