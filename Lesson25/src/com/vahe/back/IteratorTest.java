package com.vahe.back;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.add("coffee");
        menu.add("tea");
        menu.add("cake");

        for (String cur : menu) {
            System.out.println(cur);
        }

//        Iterator<String> iterator = menu.iterator();
//        while (iterator.hasNext()) {
//            String menuItem = iterator.next();
//            System.out.println(menuItem);
//        }
    }
}
