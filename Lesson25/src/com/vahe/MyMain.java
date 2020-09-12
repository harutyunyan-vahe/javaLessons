package com.vahe;

import com.vahe.garikLinkedList.MyLinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MyMain {

    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//
//        myLinkedList.add("first");
//        myLinkedList.add("second");
//        myLinkedList.add("thired");
//
//
////        MyLinkedList.MyNode node = new MyLinkedList.MyNode();
//
//
//
//        System.out.println(myLinkedList);
//
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.add("vhe");
//        arrayList.add("vhe");
//        arrayList.add("vhe");
//        arrayList.add("vhe");
//        arrayList.add("vhe");
//        arrayList.add("vhe");

        //LinkedList get(index) // O(n)
        // LlinkedList add(). remove() O(1)


        //ArrayList // get(index)// O(1)
        //ArrayList add("asdfasdf") O(1)
        //ArrayList add(index, "") O(n)


        // O(1)
        // O(n)  2n, 100n + 100_000, n/2
        // O(n^2) =  n^2 + 100n  + 100 =

        HashSet<String> set = new HashSet<>();

        set.add("vahe");
        set.add("aghas");
        set.add("garik");
        set.add("vahe");
        set.add("garik");
        set.add("varo");
        System.out.println(set);


        for (String cur : set) {
            System.out.println(cur);
        }

//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }

        //Iterable
        Iterator<String> iterator = set.iterator();

        //Iterator<String> iterator2 = set.iterator();

        while(iterator.hasNext()) {
            String cur = iterator.next();
            System.out.println(cur);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ff");
        linkedList.add("ff2");
        linkedList.add("ff3");
        linkedList.add("ff4");

        for (int i = 0; i < 10_000_000; i++) {
            linkedList.add("Item " + i);
        }
//        for (int i = 0; i < 10_000_000; i++) {
//            System.out.println(linkedList.get(i));
//        }
//        Iterator<String> iteratorLinkedList = linkedList.iterator();
//        while (iteratorLinkedList.hasNext()) {
//            String current = iteratorLinkedList.next();
//            System.out.println(current);
//        }

        for (String curr : linkedList) {
            System.out.println(curr);
        }




        //set.get(1);

    }
}
