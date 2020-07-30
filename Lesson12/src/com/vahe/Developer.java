package com.vahe;

public class Developer extends Employee {
    private String language;

    public Developer(String firstname, String lastname, double salary, String language) {
        super(firstname, lastname, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
