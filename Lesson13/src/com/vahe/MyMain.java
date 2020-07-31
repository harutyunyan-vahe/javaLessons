package com.vahe;

public class MyMain {


    public static void main(String[] args) {

//
//        Car bmw = new Car("black", "bmw");
//        Car mers = new Car("red", "mercedes");
//        Car volvo = new Car("white", "volvo");
//
//        System.out.println(Car.getObjectCount());
//
////        String br = Car.PRESIDENT_CAR.getBrand();
////        System.out.println(br);
//
//        Manager.car.setColor("Green");
//
//        System.out.println("Hello world");

//
//        Employee vahe = new Employee("vahe", 30, 100);
////
//        Employee vahe2 = vahe;
//        Employee vahe3 = vahe2;
//        Employee aa = new Employee("Aghas", 35, 1000);
//
//        vahe2 = null;
//
//        Person p = new Person("Gago", 33);

//       // p.car.setColor("black");
//        p.getName().toUpperCase();
//
//        //System.out.println(varazdat.getAge());
//
//        System.out.println(vahe2.getSalary());
//

//        vahe3 = aa;
//
//        aa.setAge(31);
//        System.out.println(vahe3.getAge());// 31


//        int a = 7;
//        int b = a;
//
//        double d1 = 55.0;
//        double d2 = d1;
//
//        d1 = 66;
//        System.out.println(d2);

//        System.out.println(volvo.COUNT);
//        System.out.println(bmw.COUNT);
//        System.out.println(bmw.COUNT);

//        int k = 10;
//        k = increment(k);
//
//        System.out.println(k);

        Employee varazdat = new Employee("Varazdat", 23, 20000);

        changeSalaryTo0(varazdat);
        changeEmpToNull(varazdat);
        changeEmpToNull(varazdat);
        changeEmpToNull(varazdat);
        changeEmpToNull(varazdat);
        System.out.println(varazdat.getSalary());

    }

    public static void changeEmpToNull(Employee employee) {
        employee = null;
//        employee.getSalary();
    }
    public static void changeSalaryTo0(Employee employee) {
        employee.setSalary(0);
    }

    public static int increment(int a) {
       // a = a + 1;
        return 10_000;
    }


//    public static void changeEmployeeSalary(Employee employee) {
//
//    }
}
