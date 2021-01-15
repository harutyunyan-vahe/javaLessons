package com.vahe.imutable;

import java.time.LocalDate;

public class ImutableTest {

    public static void main(String[] args) {
        String str = "vahe";
        String substring = str.substring(1, 2);
        System.out.println(str);

        LocalDate localDate = LocalDate.of(1990, 4, 4);

        LocalDate localDate1 = localDate.withMonth(1);


        House yerevanHouse = new House("Yerevan", 33);
        Human human = new Human("vahe", 30, yerevanHouse);

        House house = human.getHouse();
        house.setNumber(40);
//
        yerevanHouse.setNumber(99);


        System.out.println(human);
        // Double , Integer, Short , Boolean
//        Boolean aBoolean = Boolean.valueOf(true);
//        Integer integer = Integer.valueOf(1);
//        Integer integer2 = Integer.valueOf(1);
//
//        Integer a = 1; // Integer a = Integer.valueOf(1)
//        Integer k = new Integer(1);
    }

//    public static void test(Human human) {
//        Developer dev = (Developer) human;
//
//    }
}
