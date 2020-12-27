package com.hayk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapByAge {

    private static final String INPUT_FILE = "D://lessons//employes.txt";
    private static final String OUTPUT_FILE = "D://lessons//output.txt";


    public static void countByAge() throws IOException {

        Map<Integer, Integer> map = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE));

        for (String currentLine : lines) {
            String[] splitLine = currentLine.split(" ");
            Integer age = Integer.parseInt(splitLine[2].trim());

            Integer count = map.get(age);

            if (count == null) {
                map.put(age, 1);
            } else {
                map.put(age, count + 1);
            }
        }

        printMapInFile(OUTPUT_FILE, map);
        System.out.println(map);

    }


    public static void printMapInFile(String outputFile, Map<Integer, Integer> map) throws IOException {

//        Files.write(Paths.get(OUTPUT_FILE), "jskdjflskdf\naksjdflkas".getBytes(), StandardOpenOption.APPEND);
//        File file = new File(outputFile);

//        Files.newBufferedWriter(Paths.get("kksdfjls/sdkjfsdjflk"));

        Path path = Paths.get(OUTPUT_FILE);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey() + " - " + entry.getValue());
            sb.append("\n");

//            bf.write(entry.getKey() + " - " + entry.getValue());
//            bf.newLine();
        }

        Files.write(path, sb.toString().getBytes());

//        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file)) {
//
//
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                bf.write(entry.getKey() + " - " + entry.getValue());
//                bf.newLine();
//            }
//        }


    }


    public static void main(String[] args) throws IOException {
        countByAge();
    }

}
