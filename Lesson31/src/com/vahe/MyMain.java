package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyMain {
    //https://medium.com/swlh/tree-traversal-algorithms-theory-and-practice-in-java-7e7d1fe9ed30


    public static void main(String[] args) {

//        Map<String, Integer> ages = new HashMap<>();
//
//        ages.put("vahe", 30);
//        ages.put("garik", 20);
//        ages.put("hayk", 20);
//
//        Map<String, Integer> mm = Map.of("vahe", 30, "garik", 20, "hayk", 20);


        TreeMap<Employee, String> map = new TreeMap<>();

//        map.put(4, "vahe1");
//        map.put(2, "vahe2");
//        map.put(10, "vahe3");
//        map.put(0, "vahe4");
//
//        for (Map.Entry<Integer, String> cur : map.entrySet()) {
//            System.out.println(cur);
//        }


//        Stack<String> stack = new Stack<>();
//
//        stack.push("vahe");
//        stack.push("karen");
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//
//
//        Queue<String> queue = new LinkedList<>();
//
//        queue.add("vahe1");
//        queue.add("karen1");
//
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
    }


//    public static Map<Integer, List<Employee>> getEmployeeByAge(String fileName) throws IOException {
//
//        List<String> lines = Files.readAllLines(Paths.get(fileName));
//        List<Integer> allAges = new ArrayList<>();
//        List<Employee> allEmps = new ArrayList<>();
//        int count = 0;
//        for (String currentLine : lines) {
//            String[] splitedLine = currentLine.split(" ");
//            allAges.add(Integer.parseInt(splitedLine[2]));// sax ageernen
//            allEmps.add(new Employee(splitedLine[0], splitedLine[1]));
//            count++;
//
//        }
//        Map<Integer, List<Employee>> map = new HashMap<>();
//        int i = 0;
//        while (i < count) {
//            map.put(allAges.get(i), List.of(new Employee(allEmps.get(i).getFirstname(), allEmps.get(i).getLastname(), allAges.get(i))));
//            i++;
//        }
//
//
//        return map;
//    }


}
