package com.vahe;

import com.google.gson.Gson;
import com.vahe.weather.AdviceService;
import com.vahe.weather.OpenweathermapResponse;
import com.vahe.weather.WeatherServiceImpl;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {

    public static void main(String[] args) throws IOException {


//        String urlOfWeatherApp = "http://api.openweathermap.org/data/2.5/weather?q=Yerevan&APPID=88fe9edff1c38f614e49bbc96d853729&units=metric";
////        String listAmUrl = "https://www.list.am";
//        String body = Request.Get(urlOfWeatherApp)
//                .connectTimeout(1000)
//                .socketTimeout(1000)
//                .execute()
//                .returnContent()
//                .asString();
//
//        System.out.println(body);
//
////        Pattern pattern = Pattern.compile("\"temp\":\\d+");
////        Matcher matcher = pattern.matcher(body);
////        while (matcher.find()) {
////            System.out.println(matcher.group());
////        }
//
//
//        Gson gson = new Gson();
////
//        OpenweathermapResponse openweathermapResponse = gson.fromJson(body, OpenweathermapResponse.class);
////
//       System.out.println(openweathermapResponse.getMain().getTemp());


//        Scanner scanner = new Scanner(System.in);
//        String city = scanner.nextLine();

//        WeatherServiceImpl weatherService = new WeatherServiceImpl();
//        double yerevanTemp = weatherService.getTemp("yerevan");
//        System.out.println(yerevanTemp);

        WeatherServiceImpl weatherService = new WeatherServiceImpl();
        AdviceService adviceService = new AdviceService(weatherService);

        String advice = adviceService.getAdvice("Dubai");
        System.out.println(advice);
    }
}
