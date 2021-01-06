package com.vahe.stream.map;

import com.vahe.Car;
import com.vahe.Employee;
import com.vahe.stream.filter.StreamFilter;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public class StreamMap {
    public static void main(String[] args) {

        List<Employee> employees = List.of((new Employee("vahe", "har", 22)));
        // List<String> employeesAge = getEmployeesAge(employees, e -> e.getLastname());

        getEmployeesByFirstname(employees);
        getEmployeesByLastname(employees);


        List<String> empsFirstnames = getEmployeesByStringFunction(employees, (Employee emp) -> emp.getFirstname());
        getEmployeesByStringFunction(employees, (Employee emp) -> emp.getLastname());
//        getEmployeesByStringFunction(employees,  ( Employee emp) -> emp.getAge());

        getEmployeesByFunc(employees, (Employee emp) -> emp.getFirstname());
        getEmployeesByFunc(employees, (Employee emp) -> emp.getAge());

        List<Car> cars = List.of(new Car("BMW", 2010),
                new Car("Volvo", 2020),
                new Car("BMW", 2015));

//        List<Integer> years = map(cars, Car::getYear);
        List<Integer> years = map(cars, c -> c.getYear());

//        List<String> brands = map(cars, (Car c) -> {
//            return c.getBrand();
//        });

        System.out.println(years);

        List<Integer> yearsFilterd = StreamFilter.filter(years, (Integer year) -> {
            return year > 2010;
        });
        System.out.println(yearsFilterd);
    }


    public static List<Integer> getEmployeesAge(List<Employee> employees) {
        List<Integer> ages = new ArrayList<>();

        for (Employee cur : employees) {
            ages.add(cur.getAge());
        }
        return ages;
    }


    public static List<String> getEmployeesByFirstname(List<Employee> employees) {

        List<String> filteredEmps = new ArrayList<>();

        for (Employee cur : employees) {
            filteredEmps.add(cur.getFirstname());
        }
        return filteredEmps;
    }

    public static List<String> getEmployeesByLastname(List<Employee> employees) {

        List<String> ages = new ArrayList<>();

        for (Employee cur : employees) {
            ages.add(cur.getLastname());
        }
        return ages;
    }


    public static List<String> getEmployeesByStringFunction(List<Employee> employees, MyEmployeeStringFunction function) {

        List<String> returnList = new ArrayList<>();

        for (Employee curEmp : employees) {
            returnList.add(function.apply(curEmp));
        }
        return returnList;
    }


    public static <R> List<R> getEmployeesByFunc(List<Employee> employees, MyEmployeeFunction<R> function) {

        List<R> returnList = new ArrayList<>();

        for (Employee cur : employees) {
            returnList.add(function.apply(cur));
        }
        return returnList;
    }

    /**
     * the best
     *
     * @param myList
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> List<R> map(List<T> myList, MyFunction<T, R> function) {

        List<R> returnList = new ArrayList<>();

        for (T cur : myList) {
            returnList.add(function.apply(cur));
        }
        return returnList;
    }


}
