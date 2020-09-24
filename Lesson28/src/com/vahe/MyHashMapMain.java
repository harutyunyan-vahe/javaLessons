package com.vahe;


import java.util.HashMap;

public class MyHashMapMain {

    public static void main(String[] args) {

        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("a", 30);
        myHashMap.put("aa", 34);
        myHashMap.put("bb", 22);
        myHashMap.put("aaa", 22);
        myHashMap.put("1234", 22);
        myHashMap.put("12345", 22);
        myHashMap.put("123456", 22);


        Integer vaheAge = myHashMap.get("Varzdat");
        System.out.println(vaheAge);

        String str = "hello";

        System.out.println(str.length());

//        HashMap<String, Integer> map = new HashMap<>(100, 0.1F);


        System.out.println("vahe".hashCode());
        System.out.println("hayk".hashCode());
        System.out.println("hayk2".hashCode());


        Employee vahe = new Employee("vahe", " harutyuna");
        Employee garik = new Employee("garik", " harutyuna");
        HashMap<Employee, Integer> employeeIntegerHashMap = new HashMap<>();

        System.out.println("initial hashcode " + vahe.hashCode());
        employeeIntegerHashMap.put(vahe, 30);
        employeeIntegerHashMap.put(garik, 32);

        //vahe.setName("Vahe");

//        Hashtable<>

        System.out.println("after upate hashcode " + vahe.hashCode());

        Integer age = employeeIntegerHashMap.get(vahe);
        System.out.println(age);


//
//        employeeIntegerHashMap.put(vahe, 65);

//        System.out.println("vaheeeeeeeeee".hashCode());


    }
}
