package com.vahe;

public class MyHashMap3 {

    private Pair[] data;
    private int size = 0;

    public MyHashMap3() {
        data = new Pair[10];
    }

    public void put(String key, Integer value) {
        if (get(key) != null) {
            return;
        }
        if (data.length == this.size) {

//            Pair[] newData = new Pair[this.data.length * 2];
//            put()
//            for (int i = 0; i < this.data.length; i++) {
//                newData[i] = this.data[i];
//            }
//            this.data = newData;
        }
        Pair pair = this.data[getIndex(key)];
        Pair newPair = new Pair(key, value);
        if (pair == null) {
            this.data[getIndex(key)] = newPair;
        } else {
            Pair last = getLast(pair);
            last.next = newPair;
        }
        this.size++;
    }

    private int getIndex(String str) {
        return str.hashCode() % this.data.length;
    }

    private int getCode(String str) {

        return str.hashCode();

//        byte[] bytes = str.getBytes();
//        int code = 0;
//
//        for (int cur : bytes) {
//            code = code + cur;
//        }
//        return code;
    }

    private Pair getLast(Pair pair) {
        Pair cur = pair;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public Integer get(String key) {

        Pair pair = this.data[getIndex(key)];

        if (pair == null) {
            return null;
        }

        return getValue(pair, key);
    }

    private Integer getValue(Pair pair, String key) {
        Pair cur = pair;

        if (cur.key.equals(key)) {
            return cur.value;
        }
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.value;
            }
            cur = cur.next;
        }

        return null;
    }


//    private static int getCode(String str) {
//        byte[] bytes = str.getBytes();
//        int s = 0;
//        for (byte b : bytes) {
//            s += b;
//        }
//        return s;
//    }


    private static class Pair {
        String key;
        Integer value;
        Pair next;

        public Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public Pair(String key, Integer value, Pair next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
