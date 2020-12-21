package com.vahe;

import java.util.*;

public class MyMain {

    public static void main(String[] args) {

//        Map<String, Integer> map = new HashMap<>();


//        Set<String> set = new HashSet<>();
//
//        set.add("vahe");
//        set.add("vahe");
//        set.add("vahe");
//        set.add("karen");
//
//        set.contains("vahe");
//
//        set.remove("vahe");
//
//        for (String cur : set) {
//            System.out.println(cur);
//        }

//
//        MyHashSet myHashSet = new MyHashSet();
//
//        myHashSet.add("vahe");
//        myHashSet.add("vahe");
//        myHashSet.add("karen");
//        myHashSet.add("garik");
//
//        System.out.println(myHashSet.contains("vahe2"));
//
//        for (String cur : myHashSet) {
//            System.out.println(cur);
//        }

        int[] arr = new int[10_000_000];

        for (int i = 0; i < 10_000_00; i++) {
            arr[i] = i;
        }

        long start = System.currentTimeMillis();
        boolean f = find(arr, 5_000_000);
        long end = System.currentTimeMillis();
        System.out.println("time is " + (end - start));

    }


    public static boolean findInSortedArray(int[] array, int key) {

    }

    public static boolean find(int[] array, int key) {
        for (int cur : array) {
            if (cur == key) {
                return true;
            }
        }
        return false;
    }
}
