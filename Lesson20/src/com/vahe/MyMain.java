package com.vahe;

public class MyMain {

    public static void main(String[] args) {

//        //[5, 8, 9, 2, 6]  , 5
//        // [ 8, 9, 6 ] , j = 1
//
//        int y = 8;
//        System.out.println(++y);

//        Employee e1 = new Employee("Garik", 19);
//        Employee e2 = new Employee("Vahe", 30);
//        Employee e3 = new Employee("Vazgen", 17);
//
//        Employee[] empArray = new Employee[]{e1, e2, e3};
//
//
//        System.out.println("------------------------------------");
//        Employee[] greaterAge = getEmpsWhoAgeAreGreater(empArray, 25);
//
//        System.out.println(Arrays.toString(greaterAge));

//        String k = "Vahe";
//        boolean cont = k.toUpperCase().contains("ah".toUpperCase());
//        System.out.println(cont);
//        System.out.println("vahe".equalsIgnoreCase("VAHE"));

        Car bmw = new Car(200_000, "BMW");

        int k = 90;


        try {
            bmw.drive(k);
            if (3 > 1) {
                return;
            }
            if (2 > 1) {
                throw new IllegalArgumentException();
            }
//            if(consoum tvpvel et ){
//
//            }

        } catch (CarDriveException e) {
            System.out.println("User did woring input ");
        } finally {
            System.out.println("After drive");
        }

        try {

        } finally {

        }


    }

    static Employee[] getEmpsWhoAgeAreGreater(Employee[] emps, int age) {
        int count = 0;
        for (Employee cur : emps) {
            if (cur.getAge() > age) {
                count++;
            }
        }
        Employee[] resultEmps = new Employee[count];


//        for (int i = 0; i < emps.length; i++) {
//            if (emps[i].getAge() > age) {
//                resultEmps[j++] = emps[i];
//            }
//        }
        int j = 0;
        for (Employee current : emps) {
            if (current.getAge() > age) {
                resultEmps[j++] = current;
            }
        }

//        int j = 0;
//        for (int i = 0; i < emp.length; i++) {
//            for (; j < emps.length; j++) {
//                if (emps[j].getAge() > age) {
//                    emp[i] = emps[j];
//                    break;
//                }
//            }
//            j++;
//        }
        return resultEmps;
    }

    static IntPair getMinMaxEmployees(Employee[] emps) {
        int max = emps[0].getAge();
        int min = emps[0].getAge();

        for (Employee cur : emps) {
            if (cur.getAge() > max) {
                max = cur.getAge();
            }
            if (cur.getAge() < min) {
                min = cur.getAge();
            }
        }
        //int[] arr = new int[]{max, min};

        //return "Min="+ min + " max=" + max;
        return new IntPair(min, max);
    }

    static Employee max(Employee[] emps) {

        Employee max = emps[0];
//        Employee emps_1 = new Employee();
        //int max = emps[0].getAge();

        for (Employee current : emps) {
            if (current.getAge() > max.getAge()) {
//                emps_1 = current;
                max = current;
            }
        }
        return max;
    }

}
