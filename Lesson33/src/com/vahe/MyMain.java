package com.vahe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyMain {

    public static void main(String[] args) {

        Set<String> treeSet = new HashSet<>();

//        treeSet.add("west");
//        treeSet.add("east");
//        treeSet.add("nort");
//        treeSet.add("south");
//        treeSet = Collections.unmodifiableSet(treeSet);


        for (String cur : treeSet) {
            System.out.println(cur);
        }

        treeSet.add("vha");
    }
}
