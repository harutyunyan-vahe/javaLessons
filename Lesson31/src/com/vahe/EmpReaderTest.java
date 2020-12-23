package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpReaderTest {

    public static void main(String[] args) throws IOException {

        Map<Integer, List<Employee>> employeeByAge = getEmployeeByAge("D:/lessons/employes.txt");

        for (Map.Entry<Integer, List<Employee>> entry : employeeByAge.entrySet()) {
            System.out.println(entry);
        }
    }

    public static Map<Integer, List<Employee>> getEmployeeByAge(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileName));

        Map<Integer, List<Employee>> map = new HashMap<>();

        for (String currentLine : lines) {
            Employee emp = createEmp(currentLine);
            List<Employee> employees = map.get(emp.getAge());

            if (employees == null) {
                List<Employee> empsList = new ArrayList<>();
                empsList.add(emp);
                map.put(emp.getAge(), empsList);
            } else {
                employees.add(emp);
            }
        }

        return map;
    }

    private static Employee createEmp(String line) {
        String[] splitLine = line.split(" ");

        String firstName = splitLine[0].trim();
        String lastName = splitLine[1].trim();
        Integer age = Integer.parseInt(splitLine[2].trim());

        return new Employee(firstName, lastName, age);
    }
}
