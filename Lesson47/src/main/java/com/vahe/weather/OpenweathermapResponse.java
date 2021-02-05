package com.vahe.weather;

public class OpenweathermapResponse {


    private String base;
    private MainTemp main;
//    private Corrdinat coord;

    public MainTemp getMain() {
        return main;
    }

    public void setMain(MainTemp main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
