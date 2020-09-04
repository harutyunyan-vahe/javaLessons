package com.vahe;

import java.util.ArrayList;

public class MyMain2 {

    public static void main(String[] args) {
        MyStringArrayList myStringArrayList = new MyStringArrayList();
        myStringArrayList.add("vahe");
        myStringArrayList.add("aghas");//1
        myStringArrayList.add("varazdat");
        myStringArrayList.add("hayk");


        myStringArrayList.index++;

        myStringArrayList.remove(1);
        for (int i = 0; i < myStringArrayList.size(); i++) {
            System.out.println(myStringArrayList.get(i));
        }

//        System.out.println(myStringArrayList.size());
//        System.out.println(myStringArrayList.isEmpty());

//        for (int i = 0; i < myStringArrayList.size(); i++) {
//            System.out.println(myStringArrayList.get(i));
//        }


//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("vahe");
//        stringArrayList.add("aghas");
//
//
//        System.out.println(stringArrayList.size());
//        System.out.println(stringArrayList.isEmpty());

        ArrayList<String> kk = new ArrayList<>(100_000);

    }
}
