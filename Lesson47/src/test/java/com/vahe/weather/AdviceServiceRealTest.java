package com.vahe.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdviceServiceRealTest {

    private AdviceService adviceService;
    private WeatherServiceImpl weatherService;

    @BeforeEach
    void init() {
        this.weatherService = new WeatherServiceImpl();
        this.adviceService = new AdviceService(weatherService);
    }

    @Test
    void testWithReal() {
        String yerevanAdvaice = this.adviceService.getAdvice("yerevan");
        Assertions.assertEquals(AdviceService.STAY_AT_HOME, yerevanAdvaice);


        String dubaiAdvice = this.adviceService.getAdvice("Dubai");
        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK, dubaiAdvice);
    }
}
