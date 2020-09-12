package com.vahe.garikLinkedList;


public class MyLinkedList {
    private int size;
    private MyNode first;
    private MyNode last;


    public MyLinkedList() {
        this.size = 0;
    }

    public void add(String str) {
        MyNode l = this.last;
        MyNode newNode = new MyNode(l, str, null);
        this.last = newNode;


        if (l == null) {
            this.first = newNode;
        } else {
            l.setNext(newNode);
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String get(int index) {
        checkElementIndex(index);
        MyNode f = this.first;
        for (int i = 0; i < index; i++) {

            f = f.getNext();
        }
        return f.getData();
    }

    public void remove(int index) {
        this.checkElementIndex(index);

        MyNode f = this.first;

        for (int i = 0; i < index; i++) {
            f = f.getNext();
        }
        MyNode next = f.getNext();
        MyNode prev = f.getPrev();

        if (prev == null) {
            this.first = next;
        } else {
            prev.setNext(next);
            f.setPrev(null);
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.setPrev(prev);
            f.setNext(null);
        }


        f.setData(null);
        --this.size;
    }

    private void checkElementIndex(int index) {
        if (index > this.size) {
            throw new IllegalArgumentException("index is bigger than size ");
        }
        if (index < 0) {
            throw new IllegalArgumentException("index can't be negative ");
        }

    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        MyNode currentNode = this.first.getNext();
        StringBuilder str = new StringBuilder("[ ");
        str.append(this.first.getData());
//        for (int i = 1; i < this.size; i++) {
        while (currentNode != null) {
            str.append(",").append(currentNode.getData());
            currentNode = currentNode.getNext();
        }

        str.append(" ]");
        return str.toString();
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList list = (MyLinkedList) ob;

        if (list.size != this.size) {
            return false;
        }
        MyNode f1 = this.first;
        MyNode f2 = list.first;

        while (f1 != null) {
            if (!f1.getData().equals(f2.getData())) {
                return false;
            }
            f1 = f1.getNext();
            f2 = f2.getNext();
        }
        return true;
    }


    private static class MyNode {

        private String data;
        private MyNode next;
        private MyNode prev;

        public MyNode(MyNode prev, String data, MyNode next) {

//            MyLinkedList myLinkedList = new MyLinkedList();
//
//            myLinkedList.first
            this.next = next;
            this.prev = prev;
            this.data = data;
        }


        public MyNode getNext() {
            return this.next;
        }

        public MyNode getPrev() {
            return this.prev;
        }

        public String getData() {
            return this.data;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }

        public void setPrev(MyNode prev) {
            this.prev = prev;
        }

        public void setData(String data) {
            this.data = data;
        }

    }




}

