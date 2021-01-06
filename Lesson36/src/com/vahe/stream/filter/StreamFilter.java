package com.vahe.stream.filter;

import com.vahe.Employee;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("vahe", "har", 22),
                new Employee("karen", "har", 22),
                new Employee("vahe", "har", 25));


        List<String> list = new ArrayList<>();

        //filterEmployeesByName(employees, "vahe");

//        filterEmployees(employees, new MyEmployeePredicat() {
//            @Override
//            public boolean test(Employee t) {
//                return t.getFirstname().equals("vahe");
//            }
//        });

        MyPredicate<Employee> empPredicat = (Employee t) -> t.getFirstname().equals("vahe");
        List<Employee> emps = filter(employees, empPredicat);


        MyEmployeePredicat myEmployeePredicat = t -> t.getAge() == 4;
        List<Employee> emps1 = filterEmployees(employees, myEmployeePredicat);
        List<Employee> emps2 = filterEmployees(employees, t -> t.getLastname().equals("harutyunyan"));


//
//        filterEmployeesByPredicate(employees, t ->
//                t.getFirstname().equals("vahe")
//        );
        // List<Employee> filterd = filterEmployeesByFirstname(employees, "vahe");

    }


//    public static List<Employee> filterEmployeesByFirstname(List<Employee> employees, String firtname) {
//
//        List<Employee> filteredList = new ArrayList<>();
//        for (Employee cur : employees) {
//            if (cur.getFirstname().equals(firtname)) {
//                filteredList.add(cur);
//            }
//        }
//        return filteredList;
//    }


//    public static List<Employee> filterEmployeesByName(List<Employee> employees, String name) {
//
//        List<Employee> filteredEmps = new ArrayList<>();
//
//        for (Employee cur : employees) {
//            if (cur.getFirstname().equals(name)) {
//                filteredEmps.add(cur);
//            }
//        }
//        return filteredEmps;
//    }

//    public static List<Employee> filterEmployeesByAge(List<Employee> employees, int age) {
//
//        List<Employee> filteredEmps = new ArrayList<>();
//
//        for (Employee cur : employees) {
//            if (cur.getAge() == age) {
//                filteredEmps.add(cur);
//            }
//        }
//        return filteredEmps;
//    }

//    public static List<Employee> filterEmployeesByLastname(List<Employee> employees, String lastname) {
//        List<Employee> filteredEmps = new ArrayList<>();
//
//        for (Employee cur : employees) {
//            if (cur.getLastname().equals(lastname)) {
//                filteredEmps.add(cur);
//            }
//        }
//        return filteredEmps;
//    }


    public static List<Employee> filterEmployees(List<Employee> employees, MyEmployeePredicat predicat) {

        List<Employee> filteredEmps = new ArrayList<>();

        for (Employee cur : employees) {
            if (predicat.test(cur)) {
                filteredEmps.add(cur);
            }
        }

        return filteredEmps;
    }


    public static List<Employee> filterEmployeesByPredicate(List<Employee> employees, MyEmployeePredicat myEmployeePredicat) {
        List<Employee> filteredEmps = new ArrayList<>();

        for (Employee cur : employees) {
            if (myEmployeePredicat.test(cur)) {
                filteredEmps.add(cur);
            }
        }
        return filteredEmps;
    }


    /**
     * the best
     * @param inputList
     * @param myEmployeePredicat
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(List<T> inputList, MyPredicate<T> myEmployeePredicat) {
        List<T> filteredEmps = new ArrayList<>();

        for (T cur : inputList) {
            if (myEmployeePredicat.test(cur)) {
                filteredEmps.add(cur);
            }
        }
        return filteredEmps;
    }
}
