package com.vahe;

import com.vahe.list.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyMain {

    public static void main(String[] args) {

//        MyStringArrayList first = new MyStringArrayList();
//
//        first.add("garik");
//        first.add("vahe");
//
//        MyStringArrayList second = new MyStringArrayList();
//
//        second.add("vahe");
//        second.add("garik");
//        System.out.println(first.equals(second));
//        System.out.println(first);
//        System.out.println(second);

//        List<String> arrayList = new ArrayList<>();
//
//        arrayList.add("vahe");
//        arrayList.add("vahe");
//
//        arrayList.get(1);// O(1)
//
//        arrayList.remove(1); // O(n)
//
//        List<String> linkedList = new LinkedList<>();
//
//        linkedList.add("vahe");
//        linkedList.get(1);
//
//        linkedList.remove(1);// O(1)
//        linkedList.get(3);//O(n)


        MyLinkedList myLinkedList = new MyLinkedList();


        for (int i = 0; i < 10_000_000; i++) {
            myLinkedList.add("test" + i);
        }

        for (int i = 0; i < myLinkedList.size() - 1; i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println("end");
//
//        long start = System.currentTimeMillis();
//        String s = myLinkedList.get(5_000_000);
//        long end = System.currentTimeMillis();
//        System.out.println("Time is " + (end - start));
//
//        List<String> list = new LinkedList<>();


    }
}
