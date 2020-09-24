package com.vahe;

public class MyHashMap1 {

    private Pair[] data;
    private int size = 0;

    public MyHashMap1() {
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
        this.data[this.size] = new Pair(key, value);
        this.size++;
    }

    public Integer get(String key) {
        for (Pair cur : data) {
            if (cur.key.equals(key)) {
                return cur.value;
            }
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

        public Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

}
