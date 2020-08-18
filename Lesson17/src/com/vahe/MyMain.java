package com.vahe;

import java.time.LocalDate;

public class MyMain {

    public static void main(String[] args) {
        System.out.println("test");


        double price = getBookPrice(5, 10);
        System.out.println(price);

        getBookPrice(3, WeekDays.MONDAY);

        System.out.println(WeekDays.FRIDAY);

        WeekDays[] arr = WeekDays.values();

        for (WeekDays cur : arr) {
            System.out.println(cur);
        }

        WeekDays k = WeekDays.valueOf("FRIDAY");


//        TimeUnit.SECONDS.sleep(100);
//
//        WeekDays.FRIDAY.getArmenianName();


//        plus(2, 3, 3);

//        double p = calculatePension(65, Gender.FEMALE);
//
//        final int zz = 8;


        Object a = "vahe";

        Object[] objArray = {"vahe", "kkk"};

        Manager m = new Manager("vahe", 111, 1);
        Manager m2 = new Manager("vahe2", 111, 5);


        Manager[] managers = new Manager[]{m, m2};

        LocalDate[] date = {LocalDate.now()};

        Employee[] emps = managers;

        Integer[] intArr = {Integer.valueOf(5), Integer.valueOf(6)};

        //int Integer
        //double Double
        //boolean Boolean
        //char Char
        //long Long

        Integer hh = Integer.valueOf(5);
        MyInteger gg = MyInteger.valueOf(55);

        //Object[] objects = intArr;

        printArray(intArr);

        //Object k = Integer.valueOf(5);

        Long t = Long.valueOf(6);
        Double dd = Double.valueOf(5.5);

        Integer hhh = Integer.valueOf(555);
        Integer hhh2 = Integer.valueOf(555);

//        int y = hhh.intValue();
//
//        Integer ii = 7;
//        int p = ii.intValue();

        if (hhh.equals(hhh2)) {

            System.out.println("havasar en ");
        } else {
            System.out.println("havasar chen ");
        }

//        int hhhPrim = hhh.intValue();



//        Object obj = null;
//        int yy = null;
//
//        Integer iii = max(....)
//        if (iii == null) {
//            System.out.println();
//        } else {
//
//        }
    }

//    public Integer max(int[] arr) {
//
//        if(){
//
//            return null;
//        }
//    }

    public static void printArray(Object[] array) {
        for (Object cur : array) {
            System.out.println(cur.toString());
        }
    }


    //    public static double calculatePension(int age, int sex) {
//        if (sex == 1) {
//            return age * 10;
//        }
//        if(sex == 0) {
//            return age * 9;
//        }
//        return 0;
//    }
    public static double calculatePension(int age, Gender gender) {
        if (gender.equals(Gender.MALE)) {
            return age * 10;
        }
        if (gender == Gender.FEMALE) {
            return age * 9;
        }
        return 0;
    }

//    public static double getBookPrice(int count, String weekDay) {
//        double res = 0;
//        switch (weekDay) {
//
//            case "sunday":
//                res = count * 50;
//                break;
//
//            case "monday":
//                res = count * 60;
//                break;
//            case "tusday":
//                res = count * 60;
//                break;
//            case "wensday":
//                res = count * 60;
//                break;
//
//            case "":
//                res = count * 60;
//                break;
//            case 6:
//                res = count * 60;
//                break;
//            case 7:
//                res = count * 5;
//                break;
//            default:
//                System.out.println("Wrong input ");
//                break;
//        }
//    }

    public static double getBookPrice(int count, WeekDays weekDay) {
        double res = 0;
        weekDay.getArmenianName();
        switch (weekDay) {

            case SUNDAY:

                res = count * 50;
                break;

            case MONDAY:
                res = count * 60;
                break;
            case TUESDAY:
                res = count * 60;
                break;
            case THURSDAY:
                res = count * 60;
                break;

            case WEDNESDAY:
                res = count * 60;
                break;
            case FRIDAY:
                res = count * 60;
                break;
            case SATURDAY:
                res = count * 5;
                break;

        }

        return res;

    }

    /**
     * 1 - monday
     * 2 - sunday
     * 3 -
     *
     * @param count
     * @param weekDay
     * @return
     */

    public static double getBookPrice(int count, int weekDay) {

        double res = 0;

        switch (weekDay) {

            case 1:
                res = count * 50;
                break;

            case 2:
                res = count * 60;
                break;
            case 3:
                res = count * 60;
                break;
            case 4:
                res = count * 60;
                break;

            case 5:
                res = count * 60;
                break;
            case 6:
                res = count * 60;
                break;
            case 7:
                res = count * 5;
                break;
            default:
                System.out.println("Wrong input ");
                break;
        }

//        if (weekDay == 1) {
//            res = count * 50;
//        }
//
//
//
//                if (weekDay == 2) {
//            res = count * 60;
//        }
//
//        if (weekDay == 3) {
//            res = count * 40;
//        }
//
//        if (weekDay == 4) {
//            res = count * 60;
//        }
//
//        if (weekDay == 5) {
//            res = count * 60;
//        }
//
//        if (weekDay == 6) {
//            res = count * 60;
//        }
//
//        if (weekDay == 7) {
//            res = count * 60;
//        }
        return res;

    }


//    public static int plus(int a, int b, int c) {
//
//    }
//
//    public static int plus(int a, int b) {
//
//    }
//
//    public static void test(Employee e){
//
//        e.getSalary();
//    }
//
//    public double max(Shape a, Shape b, Shape c){
//
//        double m = a.getArea();
//
//        if(b.getArea() > m){
//            m = b.getArea();
//        }
//
//        if(c.getArea() > m){
//            m = c.getArea();
//        }
//
//        return m;
//    }


}
