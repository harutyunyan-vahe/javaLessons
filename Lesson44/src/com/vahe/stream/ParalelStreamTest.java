package com.vahe.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalelStreamTest {


    public static void main(String[] args) throws IOException {

        String all = new String(Files.readAllBytes(Paths.get("D:/vahe/JavaLessons/Lesson44/src/WarAndPeace.txt")));

        long start = System.currentTimeMillis();
        Map<Integer, Long> map = Stream.of(all.split("\\s+"))
                .parallel()
                .unordered()
                .filter(e -> e.length() < 12)
                .collect(Collectors.groupingByConcurrent(String::length, Collectors.counting()));
        long end = System.currentTimeMillis();

        System.out.println(map);
        System.out.println("Took " + (end - start));

    }
}
