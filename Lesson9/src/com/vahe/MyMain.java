package com.vahe;

import com.vahe.model.Employee;
import com.vahe.model.Mathem;
import com.vahe.model.MinMaxInfo;

public class MyMain {

    public static void main(String[] args) {


        int k = Mathem.plus(4, 7);

        // final int t = 6;

        ///
        //
        //
        //t = 5;
        //
        //
        //
        //


        //System.out.println(t);

//        int a = 5;
//        int k = 4;
//
//        double d1 = 2.3;
//        double d2 = 4.3;
//
//        plus(a, k);
//        plus(5.3, 6.1);
//        plus(a, d1);
//
//        plus(4, 4.5);

        MinMaxInfo a = new MinMaxInfo();

        a.minimum = 1;
        a.maximum = 10;
        a.avrg = 3.4;

        // System.out.println(a.minimum);

        MinMaxInfo info = maxAvrageMinWithClass(new int[]{5, 7, 9, 2});

        System.out.println(info.minimum);
        System.out.println(info.maximum);
        System.out.println(info.avrg);


        //Employee vv = new Employee();

        Employee vahe = new Employee("Vahe", "Harutyunyan", 15000);

//        System.out.println(vahe.firstname);
//        System.out.println(vahe.lastname);
//        vahe.firstname = "Vahe";
//        vahe.lastname = "Harutyunyan";
//        vahe.salary = 15000;

        Employee varazdat = new Employee("Varazdat", "Pogosyan", 33000);

//        varazdat.firstname = "Varazdat";
//        varazdat.lastname = "Pogosyan";
//        varazdat.salary = 33000;

        Employee tigran = new Employee("Tigran", "Demechrya", 140000);
//        tigran.firstname = "Tigran";
//        tigran.lastname = "Demechrya";
//        tigran.salary = 140000;

        //  Employee emp = findEmployee(1);


        Employee karen = new Employee("Karen", "Khondyan");

//        String fullName = Employee.getFullName(vahe);

        System.out.println(vahe.salary);
        vahe.increaseSalary(100);
        String vaheFull = vahe.getFullName();
//        Employee.increaseSalarySt(vahe, 100);
        System.out.println(vahe.salary);


//        String fullname = Employee.getFullInfo(vahe);
//        System.out.println(fullname);

//        String full = Employee.getFullInfo(vahe);
//
//        System.out.println(karen.firstname);
//        System.out.println(karen.lastname);
//        System.out.println(karen.salary);

    }


    //overloading
    static double plus(int a, double b) {
        return a + b;
    }


    static double plus(double a, int b) {
        return a + b;
    }

    static int plus(int a, int b) {
        return a + b;
    }

//    static double plus(int a, int b) {
//        System.out.println("hello ");
//        return a + b;
//    }

    static double plus(double a, double b) {
        return a + b;
    }

    static int plus(int a, int b, int c) {
        return a + b + c;
    }


//    public int max(final int a, final int b) {
//        a = 7;
//    }

    static MinMaxInfo maxAvrageMinWithClass(int[] arr) {
        int minimum = min(arr);
        int maximum = max(arr);
        double avrg = avrg(arr);

        MinMaxInfo info = new MinMaxInfo();
        info.minimum = minimum;
        info.maximum = maximum;
        info.avrg = avrg;

        return info;
    }

    static int min(int[] arr) {
        int minimum = arr[0];

        for (int cur : arr) {
            if (cur < minimum) {
                minimum = cur;
            }
        }

        return minimum;
    }

    static int max(int[] arr) {
        int m = arr[0];

        for (int cur : arr) {
            if (cur > m) {
                m = cur;
            }
        }

        return m;
    }


    static double avrg(int[] arr) {
        int s = sum(arr);
//
//        for (int cur : arr) {
//            sum += cur;
//        }
//        int mijin = s / arr.length;
        return s / arr.length;
    }

    static int sum(int[] arr) {
        int s = 0;

        for (int cur : arr) {
            s += cur;
        }
        return s;
    }

    //static Employee findEmployee(int idNumer){

    ////

    ///

//        Employee e = new Employee();
//
//        e.salary = 11.2;
//        e.firstname = "Thom";
//        e.lastname = "Jakcson";

    //  return e;


    //  }

}
