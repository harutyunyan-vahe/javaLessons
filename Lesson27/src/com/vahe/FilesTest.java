package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesTest {

    public static void main(String[] args) throws IOException {

//        Files.readAllBytes()

        List<String> strings = Files.readAllLines(Paths.get(""));

        Files.write(Paths.get("D://test.txt"), "vahe".getBytes());

        String[] s = "vahe harutyunyan".split(" ");
    }
}
