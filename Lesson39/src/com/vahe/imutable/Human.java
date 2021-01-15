package com.vahe.imutable;

public final class Human {
    private final String name;
    private final int age;
    private final House house;

    public Human(String name, int age, House house) {
        this.name = name;
        this.age = age;
        this.house = new House(house.getAddress(), house.getNumber());//copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public House getHouse() {//copy
        return new House(this.house.getAddress(), this.house.getNumber());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", house=" + house +
                '}';
    }
}
