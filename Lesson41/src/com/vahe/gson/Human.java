package com.vahe.gson;

import com.vahe.ToStringUtils;
import com.vahe.annotations.DefaultStringVal;
import com.vahe.annotations.IgnoreInToString;

public class Human {

    private String name;

    @IgnoreInToString()
    private int age;

    @DefaultStringVal(defaultValue = "unknown")
    private String sex;

    public Human() {
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return ToStringUtils.toStringReflection(this);
    }
}
