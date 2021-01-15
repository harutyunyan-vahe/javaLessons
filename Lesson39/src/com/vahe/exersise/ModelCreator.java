package com.vahe.exersise;

import com.vahe.model.Car;
import com.vahe.model.Employee;

import java.util.List;

public class ModelCreator {
    public static List<Employee> getEmps() {
        Employee vahe = new Employee("vahe", "har", 100, getCars("vahe"));
        Employee karen = new Employee("karen", "manukyan", 80, getCars("karen"));
        Employee armen = new Employee("armen", "martirosyan", 90, getCars("armen"));
        Employee anna = new Employee("anna", "karapetyan", 80, getCars("anna"));
        return List.of(vahe, karen, armen, anna);
    }

    public static List<Car> getCars(String empName) {
        return List.of(new Car(empName + " mercedes", 1000),
                new Car(empName + " Bmw", 100_000),
                new Car(empName + " Volvo", 200_000));
    }
}
