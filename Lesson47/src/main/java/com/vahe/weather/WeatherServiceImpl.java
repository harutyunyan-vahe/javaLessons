package com.vahe.weather;

import com.google.gson.Gson;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class WeatherServiceImpl implements WeatherService {

    @Override
    public double getTemp(String city) {
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&APPID=88fe9edff1c38f614e49bbc96d853729", city);

//        String harutyan = String.format(" vahe %s %s test", "harutyan", "kskks");

        String body = null;
        try {
            body = Request.Get(url)
                    .connectTimeout(1000)
                    .socketTimeout(1000)
                    .execute()
                    .returnContent()
                    .asString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new Gson();
        OpenweathermapResponse openweathermapResponse = gson.fromJson(body, OpenweathermapResponse.class);

        return openweathermapResponse.getMain().getTemp();
    }


}
