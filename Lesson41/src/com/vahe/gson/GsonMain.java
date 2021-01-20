package com.vahe.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vahe.Car;

public class GsonMain {
    public static void main(String[] args) {
//        Gson gson = new Gson();

        //jackson
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

//        String json = gson.toJson(new Car("bmw", 2020));
//        System.out.println(json);

        Car car = gson.fromJson("{\"brand\":\"bmw\",\"year\":2020}", Car.class);
//
        System.out.println(car);
    }
}
