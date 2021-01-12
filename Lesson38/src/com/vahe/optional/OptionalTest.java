package com.vahe.optional;

import com.vahe.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {


    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee("vahe", "har", 22),
                new Employee("karen", "martirosyan", 23));

        findEmpl(employees, "vahe")
                .ifPresent(System.out::println);

//        Employee e = findEmpl(employees, "vahe");
//        if (e != null) {
//            System.out.println(e);
//        }

            /*Optional<String> firstOpt = */
            Stream.of("tt", "yy", "zz")
                    .filter(e -> e.contains("a"))
                    .findFirst()
                    .ifPresent(System.out::println);
//        }

      //  firstOpt.ifPresent(System.out::println);

//        if (firstOpt.isPresent()) {
//            String s = firstOpt.get();
//            System.out.println(s);
//        }

//        List<Employee> em  = findEmplWithAge();
//        for()
    }

    public static Optional<Employee> findEmpl(List<Employee> employees, String firstname) {
        for (Employee cur : employees) {
            if (cur.getFirstname().equals(firstname)) {
                return Optional.of(cur);
            }
        }
//        return null;
        return Optional.empty();
    }

//    public Optional<Employee> getWithOptinal(){
//        Employee emp = getWithNull();
////        if (emp == null) {
////            return Optional.empty();
////        } else {
////            Optional.of(emp);
////        }
//        return Optional.ofNullable(emp);
//    }

//    private Employee getWithNull(){
//        //1000 lines of code
//    }


//    public static List<Employee> findEmplWithAge(List<Employee> employees,int age){
//
//    }
}
