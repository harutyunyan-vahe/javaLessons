package com.vahe;

import java.util.Arrays;

public class MyMain {


    public static void main(String[] args) {


//        System.out.println("test");
//
//        String str = "vahe";
//
//        String strUpper = str.toUpperCase();
//        System.out.println(str);
//        System.out.println(strUpper);
//
//        Employee e = new Employee("vahe", "harutynay", 30);
//
//        e.setAge(22);
//        e.setFirstname("vahe2");
//        e.setLastname("har2");
//
//        e.setAge(22).setFirstname("vahe2").setLastname("har2");
//        System.out.println(e.toString());


        int[] arr = {4,60,7};

        Object g = arr;

//        int[] arr2 = arr;

//        Arrays.sort(arr);
//        String str = MyMain.arrayToString(arr);
        Arrays.sort(arr);

        String str = Arrays.toString(arr);

        System.out.println(str);


    }

    public static String arrayToString(int[] arr){

//        String str = "[ ";
        StringBuilder sb = new StringBuilder("[ ");
        for(int i = 0; i < arr.length; i++){
//            str = str + arr[i] + ", ";
            sb.append(arr[i]);
            sb.append(", ");
        }
//        str = str + " ]";
        sb.append(" ]");
        return sb.toString();
    }




}
