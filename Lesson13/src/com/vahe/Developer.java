package com.vahe;

public class Developer extends Employee {
    private String lang;

    public Developer(String name, int age, double salary, String lang) {
        super(name, age, salary);
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
