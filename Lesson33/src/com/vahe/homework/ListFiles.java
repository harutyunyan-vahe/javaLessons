package com.vahe.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiles {


    public static void main(String[] args) {

        List<Path> files = null;
        try {
            files = listAllFiles("D:/lessons", "txt");
            System.out.println(files);
        } catch (IOException e) {
            System.out.println("Wrong path please correct it ....");
        }

    }

    public static List<Path> listAllFiles(String path, String ext) throws IOException {
        Path directory = Paths.get(path);

        List<Path> files = Files.list(directory)
                .collect(Collectors.toList());

        List<Path> filtedFiles = new ArrayList<>();

        for (Path cur : files) {
            if (cur.toString().endsWith(ext)) {
                filtedFiles.add(cur);
            }
        }
        return filtedFiles;
    }

}
