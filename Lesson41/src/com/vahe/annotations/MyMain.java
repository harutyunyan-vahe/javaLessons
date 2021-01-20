package com.vahe.annotations;

import com.vahe.Car;
import com.vahe.Employee;
import com.vahe.ToStringUtils;
import com.vahe.gson.Human;

public class MyMain {

    public static void main(String[] args) {
        System.out.println(new Employee("vahe", 22));
        System.out.println(new Human("vahe", 22, "male"));


//       Human h = (Human) ToStringUtils.fromStringToObject("[Human  name=vahe  age=22 sex=male ]", Human.class);
//       Car c = (Car) ToStringUtils.fromStringToObject("[Car  brand=bmw year=2020 ]", Car.class);

       //json
        //JavaScript Object notation






    }

}
