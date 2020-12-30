package com.vahe;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        queue.add("vahe");
        queue.add("karen");
        queue.add("anna");

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());


    }
}
