package com.vahe;

public class Car {
    private int year;
    private String colour;
    private int kilometer;
    private int price;

    public Car(int y, String c, int k, int p){
        this.year = y;
        this.colour = c;
        this.kilometer = k;
        this.price = p;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        this.year = y;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String s){
        this.colour = s;
    }
    public int getKilometer(){
        return this.kilometer;
    }
    public void setKilometer(int k){
        this.kilometer = k;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int p){
        this.price = p;
    }


    public void drive(int kls){
        this.kilometer = this.kilometer + kls;
    }



}
