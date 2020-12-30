package com.vahe.homeworkcheck;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeHomeWork {

    private static final String INPUT_FILE = "D:/lessons/employes.txt";
    private static final String OUTPUT_FILE = "D:/lessons/output2.txt";


    public static void main(String[] args) throws IOException {
        filterAndSort(25, INPUT_FILE);
    }

    public static void filterAndSort(int age, String path) throws IOException {
        // Path p = Paths.get(OUTPUT_FILE);

        List<String> allLines = Files.readAllLines(Paths.get(path));
        List<Employee> filteredList = new ArrayList<>();
        for (String currentLine : allLines) {
            String[] splitedLine = currentLine.split(" ");

            String firstname = splitedLine[0];
            String lastname = splitedLine[1];
            int employeeAge = Integer.parseInt(splitedLine[2]);
            if (employeeAge < age) {
                continue;
            }
            filteredList.add(new Employee(firstname, lastname, employeeAge));

        }
        Collections.sort(filteredList, new EmployeeComparator());
        StringBuilder sb = new StringBuilder();

        for (Employee cur : filteredList) {
            sb.append(cur.toString())
                    .append("\n");
        }
        Files.write(Paths.get(OUTPUT_FILE), sb.toString().getBytes(), StandardOpenOption.CREATE);
    }
}