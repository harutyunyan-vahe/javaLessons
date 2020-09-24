package com.vahe;

public class MyHashMap {

    private static final int INITIAL_SIZE = 10;

    private Pair[] data;
    private int size;

    public MyHashMap() {
        this.data = new Pair[INITIAL_SIZE];
        this.size = 0;
    }

    public void put(String key, Integer value) {
        if (get(key) != null) {//already exist
            return;
        }
//
        if (this.data.length == this.size) {
            Pair[] newArray = new Pair[this.data.length * 2];

            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }

        Pair pair = new Pair(key, value);

        this.data[getIndex(key)] = pair;
        this.size++;
    }

//    public Integer get(String key) {
//        for (int i = 0; i < this.size; i++) {
//            Pair cur = this.data[i];
//            if (cur.key.equals(key)) {
//                return cur.value;
//            }
//        }
//        return null;
//    }

    public Integer get(String key) {
        Pair pair = this.data[getIndex(key)];
        if (pair != null) {
            return pair.value;
        }
        return null;
    }

    private int getIndex(String str) {
        return str.length() % this.data.length;
    }


    private static class Pair {
        String key;
        Integer value;
        Pair next;
        public Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

    }
}
