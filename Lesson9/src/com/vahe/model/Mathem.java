package com.vahe.model;

public class Mathem {


    public static void main(String[] args) {
        plus(5, 6);
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int max(int[] arr) {
        int m = arr[0];

        for (int cur : arr) {
            if (cur > m) {
                m = cur;
            }
        }
        return m;
    }
}
