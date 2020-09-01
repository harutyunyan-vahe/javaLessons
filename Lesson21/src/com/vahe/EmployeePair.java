package com.vahe;

public class EmployeePair {
    private Employee first;
    private Employee second;

    public EmployeePair(Employee first, Employee second) {
        this.first = first;
        this.second = second;
    }

    public Employee getFirst() {
        return first;
    }

    public void setFirst(Employee first) {
        this.first = first;
    }

    public Employee getSecond() {
        return second;
    }

    public void setSecond(Employee second) {
        this.second = second;
    }
}
