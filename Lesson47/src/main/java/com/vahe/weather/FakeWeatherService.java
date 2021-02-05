package com.vahe.weather;

public class FakeWeatherService implements WeatherService {

    private double temp;
    public FakeWeatherService(double temp) {
        this.temp = temp;
    }

    @Override
    public double getTemp(String city) {
        return this.temp;
    }
}
