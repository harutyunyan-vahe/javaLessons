package com.vahe;

public class MyStringArrayList {
    private static final int INITIAL_SIZE = 10;

    private String[] data;
    private int size;

    public MyStringArrayList() {
        this.data = new String[INITIAL_SIZE];
        this.size = 0;
    }

    public void add(String element) {

        if (this.size == this.data.length) {
            String[] newArray = new String[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }
        this.data[this.size] = element;
        this.size++;
    }

    public String get(int i) {
        if (i >= this.size) {
            throw new IllegalArgumentException("Big Index: " + i);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative Index: " + i);
        }
        return this.data[i];
    }

    public void add(String data, int addIndex) {
        if (this.size == this.data.length) {
            String[] newArray = new String[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }

        for (int i = this.size - 1; i >= addIndex; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[addIndex] = data;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void remove(int removeIndex) {
        for (int i = removeIndex; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = null;
        this.size--;
    }

}
