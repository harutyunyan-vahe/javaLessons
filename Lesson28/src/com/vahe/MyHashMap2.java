package com.vahe;

public class MyHashMap2 {

    private Pair[] data;
    private int size = 0;

    public MyHashMap2() {
        data = new Pair[10];
    }

    public void put(String key, Integer value) {
        if (get(key) != null) {
            return;
        }
        if (data.length == this.size) {

            Pair[] newData = new Pair[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newData[i] = this.data[i];
            }
            this.data = newData;
        }
        Pair pair = this.data[getIndex(key)];
        if (pair != null) {
            Pair last = getLast(pair);
            last.next = new Pair(key, value, null);
        } else {
            this.data[getIndex(key)] = new Pair(key, value);
            this.size++;
        }
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


    private int getIndex(String str) {
        return getCode(str) % this.data.length;
    }

    private int getCode(String string) {
        return string.length();
    }


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
