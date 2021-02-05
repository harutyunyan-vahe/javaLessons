package com.vahe.model.assertj;

import java.util.List;

public class EmpoyeeGenerator {

    public static List<Employee> get() {

        return List.of(new Employee("vahe", 20),
                new Employee("karen", 25),
                new Employee("anna", 23));
    }
}
