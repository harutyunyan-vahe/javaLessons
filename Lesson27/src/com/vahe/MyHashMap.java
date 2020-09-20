package com.vahe;

import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.Iterator;

public class MyHashMap {

    private Pair[] data;
    private int size;

    public MyHashMap() {
        this.data = new Pair[10];
        this.size = 0;
    }

    public void put(String key, Integer value) {
        Pair pair = new Pair(key, value);

        this.data[this.size] = pair;
        this.size++;
    }

//    public String get(String key) {
//        for (Pair cur : this.data) {
//            if(cur.)
//        }
//    }



    private static class Pair {
        public Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        String key;
        Integer value;
    }
}
