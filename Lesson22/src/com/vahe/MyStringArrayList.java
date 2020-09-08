package com.vahe;

public class MyStringArrayList {

    private static final int INITIAL_SIZE = 10;

    private String[] data;
    private int index;

    public MyStringArrayList() {
        this.data = new String[INITIAL_SIZE];
        this.index = 0;
    }

    public void add(String element) {
        if (this.index == this.data.length) {
            String[] newArray = new String[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }
        this.data[this.index] = element;
        this.index++;
    }

    public String get(int i) {
        if (i >= this.index) {
            throw new IllegalArgumentException("your index it to big " + i);
        }
        if (i < 0) {
            throw new IllegalArgumentException("index could not be negative " + i);
        }
        return this.data[i];
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        return this.index == 0;
//        if (this.index == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void remove(int removeIndex) {
        for (int i = removeIndex; i < this.index - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[index-1] = null;
        this.index--;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
