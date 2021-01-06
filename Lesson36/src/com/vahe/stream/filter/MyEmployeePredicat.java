package com.vahe.stream.filter;

import com.vahe.Employee;

@FunctionalInterface
public interface MyEmployeePredicat {
    boolean test(Employee t);
}
