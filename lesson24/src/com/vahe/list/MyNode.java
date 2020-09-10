package com.vahe.list;

public class MyNode {

    private MyNode prev;
    private String data;
    private MyNode next;

    public MyNode(MyNode prev, String data, MyNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
