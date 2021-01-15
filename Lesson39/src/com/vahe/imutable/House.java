package com.vahe.imutable;

public class House {
    private /*final*/ String address;
    private /*final*/ int number;

    public House(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
