package com.vahe;

public class WrongKilometerException extends Exception {
    private int km;

    public WrongKilometerException(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }
}
