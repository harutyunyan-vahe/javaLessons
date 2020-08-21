package com.vahe;

public class MyMain {

    public static void main(String[] args) {

        String input = "233a";
        try {
            int k = Integer.valueOf(input);
            System.out.println(k);

        } catch (NumberFormatException e) {
            System.out.println("wrong number ...");

        }

//        int d = getWeekDay("wednesday");
//        if (d == -1) {
//            System.out.println("wrong input");
//        } else {
//            System.out.println("week day is " +  d);
//        }

//        try {
//            int d = getWeekDay("wednesdayyy");
//            System.out.println("week day is " + d);
//            System.out.println("test");
//        } catch (RuntimeException aaa) {
//            System.out.println("wrong input");
//        }
//
//        System.out.println("progam is going");

        // try {
        driveCar();

//        } catch (Exception e) {
//            System.out.println("wrong drive");
//        }
//


    }

    public static void driveCar() {
        Car bmw = new Car("BMW", 2010, 20_000);
// Checked (Exception, any child which is not RuntimeException (or childs)), Unchecked (RuntimeException and it's chiles)
        try {
            bmw.drive(10);
            System.out.println("Car is working");
            System.out.println("Car is working");
            System.out.println("Car is working");
        } catch (WrongKilometerException e) {
            System.out.println("you cannot drive car with " + e.getKm());
            // System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("you cannot drive car");
//            System.out.println("IllegalArgumentException..... ");
        } catch (Exception e) {
            System.out.println("Wrong input ... ");
        }

        System.out.println(bmw.getKm());
    }

    /**
     * @param weekDay
     * @throws RuntimeException
     */
    public static int getWeekDay(String weekDay) {
//
        int day;

        switch (weekDay) {
            case "sunday":
                day = 1;
                break;
            case "monday":
                day = 2;
                break;

            case "tuesday":
                day = 3;
                break;
            case "wednesday":
                day = 4;
                break;
            case "thursday":
                day = 5;
                break;
            case "friday":
                day = 6;
                break;
            case "saturday":
                day = 7;
                break;
            default:
                throw new RuntimeException("");

        }

        return day;
    }

}
