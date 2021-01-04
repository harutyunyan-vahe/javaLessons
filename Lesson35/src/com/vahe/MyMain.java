package com.vahe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyMain {


//    public static void run10TimesHello() {
//        try {
//            Thread.sleep(1000);
//
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(500);
//                System.out.println("Hello world");
//            }
//            System.out.println("End !!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


//    public static void run10TimesRead() {
//        try {
//            Thread.sleep(1000);
//
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(500);
//                String txt = new String(Files.readAllBytes(Paths.get("D:/lessons/employes.txt")));
//                System.out.println(txt.substring(0, 10).toUpperCase());
//            }
//            System.out.println("End");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void run10TimesGetFromInternet() {
//        try {
//            Thread.sleep(1000);
//
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(500);
//             // String str = HttpClinet.get("http://www.google.com").getAsString();
//              // System.out.println(str);
//            }
//            System.out.println("End");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void run10TimesFunction( ff ) {
//        try {
//            Thread.sleep(1000);
//
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(500);
//
//                ff();
//            }
//            System.out.println("End");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void run10TimesFunction(MyRunnable myRunnable) {
        try {
            Thread.sleep(1000);

            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);

                myRunnable.run();
                //myRunnable.run2();
            }
            System.out.println("End");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

//        System.out.println("Start");
//        Thread.sleep(1000);
//        System.out.println("end");

        //  run10TimesRead();

//        run10TimesFunction(printHello);
//        HelloWorldRunnable helloWorldRunnable = new HelloWorldRunnable();
//        run10TimesFunction(helloWorldRunnable);


//        ReadFromFileRunnable readFromFileRunnable = new ReadFromFileRunnable();
//        run10TimesFunction(readFromFileRunnable);


        //Annanimus inner class
//        run10TimesFunction(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world");
//            }
//        });

        run10TimesFunction(() -> System.out.println("Hello world"));

//        run10TimesFunction(new MyRunnable() {
//            @Override
//            public void run() {
//                try {
//                    String txt = new String(Files.readAllBytes(Paths.get("D:/lessons/employes.txt")));
//                    System.out.println(txt.substring(0, 10).toUpperCase());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        });

        run10TimesFunction(() -> {
            try {
                String txt = new String(Files.readAllBytes(Paths.get("D:/lessons/employes.txt")));
                System.out.println(txt.substring(0, 10).toUpperCase());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

//        Thread thread = new Thread(() -> System.out.println("test!!!!!!!!!!!!!"));
//
//        thread.start();

//        run10TimesFunction(getFromInternet);

    }

//    public static void readFromFile() throws IOException {
//        String txt = new String(Files.readAllBytes(Paths.get("D:/lessons/employes.txt")));
//        System.out.println(txt.substring(0, 10).toUpperCase());
//    }
//
//    public static void printHello(){
//        System.out.println("Hello world");
//    }

    public static void getFromInternet() {
        // String str = HttpClinet.get("http://www.google.com").getAsString();
        // System.out.println(str);


    }

}
