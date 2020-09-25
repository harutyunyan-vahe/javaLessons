package com.vahe;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class MyMain {

    public static void main(String[] args) throws IOException {
//        HashMap<String, String> map = new HashMap<>();
//
//        map.put("vahe", "harutyunyan");
//        map.put("karen", "martirosyan");
//        Set<String> keys = map.keySet();
//        Collection<String> values = map.values();
//
//        System.out.println(keys);
//        System.out.println(values);
//
//        Set<Map.Entry<String, String>> entries = map.entrySet();

//        Calculator.calculateResult();

//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//
//        map.put("vahe", 22);
//        map.put("kare", 33);
//        map.put("armen", 11);
//        map.put("tiko", 11);
//
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for(Map.Entry<String, Integer> entry : entries){
//            System.out.println(entry.getKey() + "  " + entry.getValue());
//        }


//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("vahe");
//        list.add("kare");
//        list.add("zzz");


        List<String> vah = Arrays.asList("vah", "1");

        List<String> list = List.of("aa", "vahe", "karen", "zzz");

        Set<String> vahe2 = Set.of("vahe", "kare");

        Map<String, Integer> vahe1 = Map.of("vahe", 33, "kare", 34);

        List<String> k = new ArrayList<>();

        //List<String> list = new ArrayList<>();


        //String[] ggg = {"vhe", "jksdlfk"};


        Employee vahe = new Employee("vahe", 30);
        Employee karen = new Employee("karen", 32);

        List<Employee> emps = new ArrayList<>();
        emps.add(vahe);
        emps.add(karen);


        String max = Collections.min(list);
        System.out.println(max);

        Employee maxEm = Collections.max(emps);
        System.out.println(maxEm.getName());

        Collections.sort(emps);


    }

    public static String toString(List<String> list) {

        StringBuilder sb = new StringBuilder();
        for (String cur : list) {
            sb.append(cur);
        }
        return sb.toString();

    }


    public Map<Integer, List<Employee>> getEmployeeByAge( String fileName) {


        Map<Integer, List<Employee>> map = new HashMap<>();

//        map.put(30, List.of(new Employee("aa", "har", 30), new Employee("bbb", "harutyun", 30)));
//
//        map.put(33 , List.of(new Employee("karen martirosyan 33")));
//
        return map;
    }


}
