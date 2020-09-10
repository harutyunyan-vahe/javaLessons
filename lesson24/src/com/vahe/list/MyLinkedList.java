package com.vahe.list;

public class MyLinkedList {

    private MyNode first;
    private MyNode last;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(String data) {
        linkLast(data);
    }

    private void linkLast(String e) {
        MyNode l = this.last;
        MyNode newNode = new MyNode(l, e, null);
        this.last = newNode;
        if (l == null) {
            this.first = newNode;
        } else {
            l.setNext(newNode);
        }

        ++this.size;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
//        if (this.size == 0) {
//            return true;
//        }
//        return false;
        return this.size == 0;
    }

    public String get(int index) {
        this.checkElementIndex(index);
        MyNode node = this.getNode(index);
        return node.getData();
    }

    private MyNode getNode(int index) {
        MyNode x;

        x = this.first;
        for (int i = 0; i < index; ++i) {
            x = x.getNext();
        }
        return x;
    }

    public void remove(int index) {
        this.checkElementIndex(index);
        MyNode node = this.getNode(index);
        this.unlink(node);

    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index is wrong " + index);
        }
    }

    private void unlink(MyNode x) {
        MyNode next = x.getNext();
        MyNode prev = x.getPrev();
        if (prev == null) {
            this.first = next;// if deleted node is fist
        } else {
            prev.setNext(next);
            x.setPrev(null);
        }

        if (next == null) {
            this.last = prev;// if deleted node is last
        } else {
            next.setPrev(prev);
            x.setNext(null);
        }

        x.setData(null);
        --this.size;

    }


}
