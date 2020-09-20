package com.vahe;

public class MyHashMapMain2 {

    public static void main(String[] args) {
        MyHashMap2 map2 = new MyHashMap2();


        map2.put("v", 22);
        map2.put("v2", 22);
        map2.put("v3", 22);
        map2.put("v2", 123);

        System.out.println(map2.get("v2"));
    }
}
