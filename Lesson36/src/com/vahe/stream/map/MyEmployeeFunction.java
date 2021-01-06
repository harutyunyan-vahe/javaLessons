package com.vahe.stream.map;

import com.vahe.Employee;

public interface MyEmployeeFunction<R> {

    R apply(Employee t);
}
