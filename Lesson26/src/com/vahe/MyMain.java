package com.vahe;

import java.util.*;

public class MyMain {

    public static void main(String[] args) {


        Iterable<String> col = new TreeSet<>();



//        HashSet<String> set = new HashSet<>();
//
//        set.add("vahe");
//        set.add("hayk");
//
//        boolean bool = set.remove("vahe222");
//
//        System.out.println(bool);

//        LinkedList<String> list = new LinkedList<>();
//
//        list.add("vahe");
//        list.add("vahe2");
//        list.add("vahe3");
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//            if (next.equals("vahe2")) {
//                iterator.remove();
////                iterator.remove();
//            }
//        }
        // System.out.println(list);

        testConcurrentException2();
    }

    public static void testConcurrentException2() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("vahe");
        linkedList.add("karen");
        linkedList.add("armen");
        linkedList.add("gago");
        linkedList.add("varazdat");
        linkedList.add("varazdat");

//        for (String cur : linkedList) {
//            System.out.println(cur);
//            if (cur.equals("armen")) {
//                linkedList.remove("armen");
//            }
//        }
//
//        Iterator<String> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            String current = iterator.next();
//            System.out.println(current);
//            if (current.equals("armen")) {
//                iterator.remove();
//            }
//        }


    }

    public static void testConcurrentException1() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("vahe");
        linkedList.add("karen");
        linkedList.add("armen");
        linkedList.add("gago");
        linkedList.add("varazdat");
        linkedList.add("varazdat");

        Iterator<String> iterator1 = linkedList.iterator();
        Iterator<String> iterator2 = linkedList.iterator();


        iterator1.next();
        iterator1.remove();
        if (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(linkedList);
    }


}
