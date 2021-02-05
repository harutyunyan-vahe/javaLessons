package com.vahe.weather;

public class AdviceServiceWithFake {

    public static final String GO_AND_HAVE_A_WALK = "Go and have a walk";
    public static final String STAY_AT_HOME = "Stay at home";
    public static final int TEMP = 10;


    private WeatherService weatherService;

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public AdviceServiceWithFake(WeatherService weatherService) {
        this.weatherService = weatherService;
//        this.weatherService = new WeatherServiceImpl();
    }

    public String getAdvice(String city) {
        double temp = this.weatherService.getTemp(city);
        if (temp > TEMP) {
            return GO_AND_HAVE_A_WALK;
        } else {
            return STAY_AT_HOME;
        }
    }
}
