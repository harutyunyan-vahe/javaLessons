package com.vahe;

public class MyMain {

    public static void main(String[] args) {

        // OOP = Object Oriented programming

        // max(5, 9);
        Employee vahe = new Employee("vahe", "harutyunayn", 100, 30);
        Employee gago = new Employee("gago", "karapetyan", -350_000, 70);

        //int y = vahe.age;

        vahe.setFirstname("@@@@@");
        //vahe.firstname = "@@@@@@";

        //gago.salary = -88000;
        gago.setSalary(-88000000);
        System.out.println();

        if (gago.getPension() < 30_000) {
            ////
            System.out.println("Tveq 1000 dolar");
        }

        System.out.println("Gago pension is " + gago.getPension());


//        String str = vahe.lastname;


//        vahe.firstname = "vahe";
//        vahe.lastname = "hartuyuayn";
//        vahe.salary = 100;

        Employee aghas = new Employee("aghas", "kerobyan", 1000, 35);

//        aghas.increaseSalary(50);
        // MyMain.increaseSalary(aghas, 50);
//        System.out.println(aghas.getSalary());
//        System.out.println(vahe.getSalary());


//        String fullname = MyMain.getFullname(vahe);
        String fullInfo = aghas.getFullInfo();


        System.out.println(fullInfo);
//        aghas.firstname = "aghas";
//        aghas.lastname = "kerobyan";
//        aghas.salary = 1000;


        System.out.println("-----------------------");

        Rectangle r = new Rectangle(5, 10);

        r.setHeight(-20);

        double area = r.calculateArea();
        System.out.println(area);

        double par = r.calculateParameter();
        System.out.println(par);

    }

//    static void increaseSalary(Employee employee, double delta) {
//        employee.salary = employee.salary + delta;
//    }

//    static String getFullname(Employee employee) {
//        return employee.firstname + "  " + employee.lastname;
//    }


    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }


}
