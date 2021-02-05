package com.vahe.weather;

public class AdviceService {

    public static final String GO_AND_HAVE_A_WALK = "Go and have a walk";
    public static final String STAY_AT_HOME = "Stay at home";
    public static final int TEMP = 10;


    private WeatherServiceImpl weatherService;


    public AdviceService(WeatherServiceImpl weatherService) {
        this.weatherService = weatherService;
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
