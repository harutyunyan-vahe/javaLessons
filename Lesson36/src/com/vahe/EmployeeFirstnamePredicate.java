package com.vahe;

import com.vahe.stream.filter.MyEmployeePredicat;

public class EmployeeFirstnamePredicate implements MyEmployeePredicat {


    @Override
    public boolean test(Employee t) {
        return t.getFirstname().equals("vahe");
    }
}
