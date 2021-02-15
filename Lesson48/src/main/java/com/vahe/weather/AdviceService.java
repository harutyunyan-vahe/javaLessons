package com.vahe.weather;

import java.util.List;

public class AdviceService {

    public static final String GO_AND_HAVE_A_WALK = "Go and have a walk";
    public static final String STAY_AT_HOME = "Stay at home";
    public static final int TEMP = 10;
    public static final String ERROR_IN_CALL = "Error in call";


    private WeatherService weatherService;

    public static final String PRAHA = "Praha";
    public static final String BERLIN = "Berlin";


    private static final List<String> BLOCKED_CITIES = List.of(PRAHA, BERLIN);


    public AdviceService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getAdvice(String city) {
        if (BLOCKED_CITIES.contains(city)) {
            return STAY_AT_HOME;
        }
        double temp;
        try {
            temp = this.weatherService.getTemp(city);

        } catch (Exception e) {
            return ERROR_IN_CALL;
        }
        if (temp > TEMP) {
            return GO_AND_HAVE_A_WALK;
        } else {
            return STAY_AT_HOME;
        }
    }
}
