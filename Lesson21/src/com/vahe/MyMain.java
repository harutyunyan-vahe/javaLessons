package com.vahe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class MyMain {

    public static void main(String[] args) {


        Employee e1 = new Employee("Garik", 19);
        Employee e2 = new Employee("Vahe", 30);
        Employee e3 = new Employee("Vazgen", 17);

        MyCompariable[] empArray = {e1, e2, e3};

        ObjectPair minMax = getMinMax(empArray);

        ObjectPair objectPair = new ObjectPair("aa", "bb");
        ObjectPair datePari = new ObjectPair(new Date(), new Date());
        ObjectPair empPair = new ObjectPair("e1", e2);

//        Employee first = (Employee) empPair.getFirst();

        GenericPair<Employee> employeeGenericPair = new GenericPair<>(e1, e2);

        GenericPair<String> stringGenericPair = new GenericPair<>("aa", "bb");

        Employee e =  employeeGenericPair.getFirst();


//        String mi = (String) GenericMethodTest.getMiddle("vahe", new Date(), "varzdat");
        String mi2 = GenericMethodTest.getMiddleGeneric("vahe","ff", "varzdat");
//        System.out.println(mi);
//        System.out.println(mi2);

//        if(stringGenericPair instanceof GenericPair<String>){ Error
//
//        }

//        GenericPair<int> k = new GenericPair<int>(1,3);
        GenericPair<Integer> k2 = new GenericPair<Integer>(1,3);
//        GenericPair<Integer>[] arr = new GenericPair<Integer>[10];

        //ArrayList<String> list = new ArrayList<>();

        String max = GenericMethodTest.getMax("aa", "zz", "cc" );

//        Employee max1 = GenericMethodTest.getMax(e1, "e2", e3);
        System.out.println(max);

//        Collections.sort();

    }


//    public static void test( GenericPair<Employee>  w){
//
//    }
//
//
//    public static void test( GenericPair<String>  w){
//
//    }

    static ObjectPair getMinMax(MyCompariable[] rectangles) {
        MyCompariable maxRec = rectangles[0];
        MyCompariable minRec = rectangles[0];
        for (MyCompariable cur : rectangles) {
//            if (cur.getArea() > maxEmp.getArea()) {
            if (cur.compare(maxRec) == 1) {
                maxRec = cur;
            }
//            if (cur.getArea() < minRec.getArea()) {
            if (cur.compare(minRec) == -1) {
                minRec = cur;
            }
        }
        return new ObjectPair(minRec, maxRec);
    }


//    static ObjectPair getMinMaxEmployees(Rectangle[] rectangles) {
//        Rectangle maxRec = rectangles[0];
//        Rectangle minRec = rectangles[0];
//        for (Rectangle cur : rectangles) {
////            if (cur.getArea() > maxEmp.getArea()) {
//            if (cur.compare(maxRec) == 1) {
//                maxRec = cur;
//            }
////            if (cur.getArea() < minRec.getArea()) {
//            if (cur.compare(minRec) == -1) {
//                minRec = cur;
//            }
//        }
//        return new ObjectPair(minRec, maxRec);
//    }

//
//    static ObjectPair getMinMaxEmployees(Employee[] emps) {
//        Employee maxEmp = emps[0];
//        Employee minEmp = emps[0];
//        for (Employee cur : emps) {
////            if (cur.getAge() > maxEmp.getAge()) {
//            if (cur.compare(maxEmp) == 1) {
//                maxEmp = cur;
//            }
////            if (cur.getAge() < minEmp.getAge()) {
//            if (cur.compare(minEmp) == -1) {
//                minEmp = cur;
//            }
//        }
//
//        return new ObjectPair(minEmp, maxEmp);
//    }

}
