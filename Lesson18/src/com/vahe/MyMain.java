package com.vahe;

public class MyMain {

    public static void main(String[] args) {


        Employee vahe = new Employee("vahe harutynyan", 11);
        Employee garik = new Employee("garik", 22);
        Employee aghas = new Employee("Aghas", 33);



        Employee max = (Employee) maxGeneric(vahe, garik, aghas);

        System.out.println(max.getName());

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 15);
        Rectangle r3 = new Rectangle(1, 2);

        Rectangle maxRec = (Rectangle) maxGeneric(r1, r2, r3);

        Car car1 = new Car(1995, "Bmw");
        Car car2 = new Car(2000, "Merdedes");
        Car car3 = new Car(1991, "Volvo");


        Car maxCar = (Car) maxGeneric(car1, car2, car3);
        System.out.println(maxCar);
        System.out.println(maxRec);

        String a = "aaa";
        String b = "bbb";

        int i = a.compareTo(a);
        System.out.println(i);

        vahe.doWork();

        TestClass d = new TestClass();
        d.a2();
    }

    public static MyComparable maxGeneric(MyComparable a, MyComparable b, MyComparable c) {

        MyComparable max = a;

        if (b.compare(max) == 1) { // b > max
            max = b;
        }

        if (c.compare(max) == 1) {
            max = c;
        }
        return max;
    }

//    public static Car max(Car a, Car b, Car c) {
//        Car max = a;
//
//        if(b.compare(max) == 1){ // b > max
//            max = b;
//        }
//
//        if (c.compare(max) == 1) {
//            max = c;
//        }
//        return max;
//    }

//    public static Employee max(Employee a, Employee b, Employee c) {
//        Employee max = a;
//
//        if(b.compare(max) == 1){ // b > max
//            max = b;
//        }
//
//        if (c.compare(max) == 1) {
//            max = c;
//        }
//        return max;
//    }

//    public static Rectangle max(Rectangle a, Rectangle b, Rectangle c) {
//        Rectangle max = a;
//
//        if(b.compare(max) == 1){ // b > max
//            max = b;
//        }
//
//        if (c.compare(max) == 1) {
//            max = c;
//        }
//        return max;
//    }

//    public static int max(int a, int b, int c) {
//        int m = a;
//        if (b > m) {
//            m = b;
//        }
//    }

    public static void runAllRunner(Runner runner, Runner runner2) {
//        if (runner instanceof Employee) {
//            Employee emp = (Employee) runner;
//        }
        runner.run();
        runner2.run();
    }


    public static String getName() {
        return "ggg";
    }


}
