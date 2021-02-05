package com.vahe.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AdviceServiceMockTest {

    private AdviceService adviceService;
    private WeatherServiceImpl weatherServiceMock;

    @BeforeEach
    void init() {
//        this.weatherServiceMock = new WeatherService();
        weatherServiceMock = Mockito.mock(WeatherServiceImpl.class);
        this.adviceService = new AdviceService(weatherServiceMock);
    }

    @Test
    void testWithMock() {
        Mockito.when(weatherServiceMock.getTemp("yerevan")).thenReturn(15D);
        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK,
                this.adviceService.getAdvice("yerevan"));

       // Mockito.verify(weatherServiceMock).getTemp("yerevan1");

        Mockito.when(weatherServiceMock.getTemp("yerevan")).thenReturn(0D);
        Assertions.assertEquals(AdviceService.STAY_AT_HOME, this.adviceService.getAdvice("yerevan"));
    }

//    @Test
//    void testWithReal() {
//
////        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK, this.adviceService.getAdvice("yerevan"));
//
//
//        Assertions.assertEquals(AdviceService.STAY_AT_HOME, this.adviceService.getAdvice("yerevan"));
//        Assertions.assertEquals(AdviceService.STAY_AT_HOME, this.adviceService.getAdvice("yerevan"));
//    }
}
