package com.vahe;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("aa");
        stack.push("bb");
        stack.push("cc");




//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        test1(22);
        stackOverFlowTest(111);
    }
//
//    /**
//     * "{(a) [b] ((5))}"
//     * @param str
//     * @return
//     */
//    public boolean isParenteciesValid(String str){
//
//    }
    public static void stackOverFlowTest(int a) {
        stackOverFlowTest(a);
    }


    public static void test1(int a) {

        test2("aaaa");
    }

    public static void test2(String a) {

        test3("sdf");
    }

    public static void test3(String a) {

    }
}
