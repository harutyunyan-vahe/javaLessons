package com.vahe;

public class GenericMethodTest {

    static Object getMiddle(Object... args) {
        return args[args.length / 2];
    }

    static <T> T getMiddleGeneric(T... args) {
        return args[args.length / 2];
    }


    static <T extends Comparable> T getMax(T... args) {

        T max = args[0];

        for (T cur : args) {
            if (cur.compareTo(max) > 0) {
                max = cur;
            }
        }
        return max;
    }


//    static  Comparable getMax(Comparable... args) {
//
//        Comparable max = args[0];
//
//        for (Comparable cur : args) {
//            if (cur.compareTo(max) == 1) {
//                max = cur;
//            }
//        }
//        return max;
//    }
}
