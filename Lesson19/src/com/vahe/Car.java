package com.vahe;

public class Car {
    private String brand;
    private int year;
    private int km;

    public Car(String brand, int year, int km) {
        this.brand = brand;
        this.year = year;
        this.km = km;
    }

    /**
     *
     * @param kilometers
     * @throws RuntimeException
     */
    public void drive(int kilometers) throws WrongKilometerException {
        if (kilometers < 0) {
            throw new WrongKilometerException(kilometers);
        }

        if (kilometers == 10) {
            throw new IllegalArgumentException("Kilmoter is 10 which is wrong");
        }

//        if (kilometers > 0) {
            this.km = this.km + kilometers;

//        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
