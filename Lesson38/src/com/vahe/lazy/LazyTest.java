package com.vahe.lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LazyTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100_000_000; i++) {
            numbers.add(i);
        }

        //itnermidate(map, filter, limit, peek) -- lazy
        // terminal(findFist, findAny, collect, reduce, foreach)
        List<Integer> result =
                numbers.stream()
                        .map(e -> {
                            System.out.println("mapping is working ");
                            return e * 2;
                        })
                        .filter(e -> {
                            System.out.println("testing filter");
                            return e < 10_000;
                        })
                        .limit(10)
                        .collect(Collectors.toList());


//        List<Integer> maped = List.of(1, 3, 34)
//                .map(e -> e);

        //[1,3, 4].map(e => e * 2) js example
//        System.out.println(result);

    }
}
