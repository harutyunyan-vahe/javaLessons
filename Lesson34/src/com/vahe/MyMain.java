package com.vahe;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyMain {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();


        treeMap.put("vahe", 30);
        treeMap.put("garik", 20);

        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();

        for (Map.Entry<String, Integer> cur : entries) {
            System.out.println(cur.getKey() + "  " + cur.getValue());
        }
    }

}
