package com.vahe.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdviceServiceFakeTest {

    private AdviceServiceWithFake adviceServiceWithFake;
    private WeatherService weatherServiceMock;

    @BeforeEach
    void init() {
        this.weatherServiceMock = new FakeWeatherService(15); //new  WeatherServiceImpl();
        this.adviceServiceWithFake = new AdviceServiceWithFake(weatherServiceMock);
    }


    @Test
    void testWithReal() {
        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK,
                this.adviceServiceWithFake.getAdvice("yerevan"));

        this.adviceServiceWithFake.setWeatherService(new FakeWeatherService(-5));

        Assertions.assertEquals(AdviceService.STAY_AT_HOME,
                this.adviceServiceWithFake.getAdvice("yerevan"));

        //Assertions.assertEquals(AdviceService.STAY_AT_HOME, this.adviceService.getAdvice("yerevan"));
    }
}
