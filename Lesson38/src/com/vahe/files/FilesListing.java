package com.vahe.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesListing {
    public static void main(String[] args) throws IOException {
        Stream<Path> pathStream = Files.list(Paths.get("D:/lessons"));

//        List<Path> files = Files.list(Paths.get("D:/lessons"))
//                .collect(Collectors.toList());
//
//
//        for (Path curPath : files) {
//            if (curPath.toString().endsWith("txt")) {
//                System.out.println(curPath.toString());
//            }
//        }

        Files.list(Paths.get("D:/lessons"))
                .map(Path::toString)
                .filter(e -> e.endsWith("txt"))
                .forEach(System.out::println);

    }
}
