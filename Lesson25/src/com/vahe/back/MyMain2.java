package com.vahe.back;

import java.util.*;

public class MyMain2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("first");
        list.add("second");

        ListIterator<String> iterator = list.listIterator();


        while (iterator.hasNext()) {

            String current = iterator.next();

            if (current.equals("first")) {

                iterator.add("kkk");
                iterator.add("kkk");
                iterator.add("kkk");
            }
//            if (current.contains("fi")) {
//                iterator.remove();
//            }
            //System.out.println(current);
        }






    }
}
