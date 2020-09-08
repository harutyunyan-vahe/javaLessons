package com.vahe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {

    public static void main(String[] args) {
//        System.out.println("main");
//
//        String k = "vahe";
//
//        MyStringArrayList myStringArrayList = new MyStringArrayList();
//
//        for (int i = 0; i < 10; i++) {
//            myStringArrayList.add("Test " + i);
//        }


//        System.out.println(myStringArrayList.get(0));
//
//        long start = System.currentTimeMillis();//
//        myStringArrayList.remove(100);
//        long end = System.currentTimeMillis();
////
//        System.out.println("remove tooks  " + (end - start));
//        System.out.println("End");
//
//        ArrayList<String> list = new ArrayList<>();

        String[] ar = {"vahe", "garik"};
        ArrayList<String> strList = toList(ar);
        System.out.println(strList);

        List<String> kk = new ArrayList<>();
        List<String> strings = Arrays.asList(ar);



    }

    public static ArrayList<String> toList(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String current : arr) {
            arrayList.add(current);
        }
        return arrayList;
//        return new ArrayList<>();
    }
}
