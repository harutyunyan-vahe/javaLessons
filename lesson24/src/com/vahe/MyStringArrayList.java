package com.vahe;

public class MyStringArrayList {

    private static final int INITIAL_SIZE = 10;

    private String[] data;
    private int size;

    public MyStringArrayList() {
        this.data = new String[INITIAL_SIZE];
        this.size = 0;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        StringBuilder str = new StringBuilder("[ ");
        str.append(this.data[0]);
        for (int i = 1; i < this.size; i++) {
            str.append(" , ");
            str.append(this.data[i]);
        }
        str.append(" ]");

        return str.toString();
    }

    @Override
    public boolean equals(Object other) {

        if (!(other instanceof MyStringArrayList)) {
            return false;
        }

        MyStringArrayList arrayList = (MyStringArrayList) other;

        if (this.size != arrayList.size) {
            return false;
        }

        for (int i = 0; i < arrayList.size; i++) {
            if (!this.data[i].equals(arrayList.data[i])) {
                return false;
            }
        }
        return true;
    }


//    @Override
//    public String toString() {
//
//        ArrayList<String> list = new ArrayList<String>();
//
//        for(String cur : this.data) {
//            if(cur != null ) {
//                list.add(cur);
//            }
//        }
//        return "MyStringArrayList: [ dataArray = " + list + ", size = " + this.size + " ]";
//    }


//    @Override
//    public boolean equals(Object obj) {
//
//        if (obj instanceof MyStringArrayList) {
//            MyStringArrayList list = (MyStringArrayList) obj;
//
//            if (this.size == list.size) {
//                int count = 0;
//                for (int i = 0; i < this.size; i++) {
//                   if (this.data[i].equals(list.data[i])) {
//                       count++;
//                   }
//                }
//                return count == this.size;
//            }
//        }
//        return false;
//    }


    public void add(String data, int addIndex) {

        if (this.size == this.data.length) {
            String[] newArray = new String[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }

        for (int i = (this.size - 1); i >= addIndex; i--) {
            this.data[i + 1] = this.data[i];
        }

        this.data[addIndex] = data;
        this.size++;
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
