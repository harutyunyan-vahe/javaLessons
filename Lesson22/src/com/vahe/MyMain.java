package com.vahe;

import java.util.*;

public class MyMain {

    public static void main(String[] args) {
//        System.out.println("test");
//        Pair<Manager> managerPair = new Pair<>();
//
//        List<String> aa = new ArrayList<>();
//        print(managerPair);

//        Employee e = new Manager();
//
//        Employee[] empsArray = new Manager[]{};
//
////        Pair<Employee> empsPari = new Pair<Manager>();
//
//        Pair<Manager> managerPair = new Pair<>();
//
////        Collections.sort();
//
//        printName(managerPair);
//        empsPari.setFirst(new Developer());
//        List<Employee> employees

//
//        int[] a = new int[10];
//        double[] ad = new double[10];
//
//        String[] kk = new String[10];
//        kk = new String[11];

//        boolean[] aaaa = new boolean[10];
//        System.out.println(Arrays.toString(aaaa));

        String[] names = {"vahe", "aghas", "garik"};

        String[] filteredNames = getNames(names, "va");

//        System.out.println(Arrays.toString(filteredNames));

//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.add("vahe");
//        arrayList.add("aghas");
//        arrayList.add("aghas2");
//        arrayList.add("aghas3");
//        arrayList.add("aghas4");
//        arrayList.add("aghas5");


//        System.out.println(arrayList.get(0));

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        for (String curEle : arrayList) {
//            System.out.println(curEle);
//        }
//        System.out.println(arrayList);

        ArrayList<String> list = getNamesArrayList(names, "v");



//        Employee e = new Employee();
//        e.setName("vahe");
//        e.setSalary(111);
//        System.out.println(e);

        System.out.println(list);

//        ArrayList<String> test = new ArrayList<>();
//        test.add("aaa");
//        test.add("bbb");
//        test.add("ccc");
//        test.remove("ccc");
//        test.add(1, "zzz");
//
//        System.out.println(test);

        boolean empty = list.isEmpty();


    }

    public  static String[] getNames(String[] names, String key) {
        int count = 0;
        for (String cur : names) {
            if (cur.contains(key)) {
                count++;
            }
        }
        String[] filteredNames = new String[count];

//        ArrayList<String> filteredNames = new ArrayList<>();

        int index = 0;

        for (String cur : names) {
            if (cur.contains(key)) {

                filteredNames[index] = cur;
                index++;
            }
        }
        return filteredNames;
    }

    public  static ArrayList<String> getNamesArrayList(String[] names, String key) {
        ArrayList<String> filteredNames = new ArrayList<>();

        for (String cur : names) {
            if (cur.contains(key)) {
                filteredNames.add(cur);
            }
        }
        return filteredNames;
    }

//    public void doSomething(List<String> list) {
//
//    }
//
//    public void doSomething(List<Date> list) {
//
//    }


//    static void test(List e){
//
//    }

    public static void printName(Pair<? extends Employee> e) {
        System.out.println(e.getFirst().getName());
        System.out.println(e.getSecond().getName());
    }
//
    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()){
                min = a[i];
            }
            if (max.getBonus() < a[i].getBonus()){
                max = a[i];
            }
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}
