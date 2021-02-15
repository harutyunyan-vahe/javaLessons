package com.vahe.weather;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

//https://site.mockito.org/
@ExtendWith(MockitoExtension.class)
public class AdviceServiceTest /*extends BaseTest*/ {

    //@InjectMocks
    private AdviceService adviceService;

    @Mock
    private WeatherService mockWeatherService;

    @BeforeEach
    public void init(){
        this.adviceService = new AdviceService(this.mockWeatherService);
    }


//    private AutoCloseable autoCloseable;
//    @BeforeEach
//    public void before() {
//          this.autoCloseable = MockitoAnnotations.openMocks(this);
//         // MockitoAnnotations.initMocks(this);
//
//
//       // this.mockWeatherService = Mockito.spy(WeatherService.class);
////        this.mockCarSerive = Mockito.spy(CarPriceSerice.class);
////        this.mockCarSerive = Mockito.spy(CarPriceSerice.class);
////        this.mockCarSerive = Mockito.spy(CarPriceSerice.class);
//
//      //  this.adviceService = new AdviceService(mockWeatherService );
//    }

//    @AfterEach
//    public void after() throws Exception {
//         this.autoCloseable.close();
//    }

    @Test
    public void test_yerevan() {

//        Mockito.when(this.mockWeatherService.getName()).thenReturn("kkkkkkkkkkkkk");
//        System.out.println(this.mockWeatherService.getName());

        Mockito.doReturn(11.0).when(this.mockWeatherService).getTemp("yerevan");
//        Mockito.when(this.mockWeatherService.getTemp(Mockito.anyString())).thenReturn(11.0);

        //   System.out.println(this.mockWeatherService.getTemp("dsfsdf"));

        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK,
                this.adviceService.getAdvice("yerevan"));

        Mockito.verify(this.mockWeatherService).getTemp("yerevan");
    }


    @Test
    public void test_blocked_cites() {

        String advice = this.adviceService.getAdvice(AdviceService.BERLIN);
        Assertions.assertEquals(AdviceService.STAY_AT_HOME, advice);

        Mockito.verifyNoInteractions(this.mockWeatherService);
    }


    @Test
    public void test_exception() {
        Mockito.doThrow(RuntimeException.class).when(this.mockWeatherService).getTemp("yerevan");

        String advice = this.adviceService.getAdvice("yerevan");

        Assertions.assertEquals(AdviceService.ERROR_IN_CALL, advice);
    }


    @Test
    public void test_spy() {
        System.out.println(this.mockWeatherService.getName());

        // Assertions.assertEquals("Weather api", this.mockWeatherService.getName());

        //Mockito.when(this.mockWeatherService.getTemp(Mockito.anyString())).thenReturn(11.0);
        Mockito.doReturn(11.0).when(this.mockWeatherService).getTemp(Mockito.anyString());


        String advice = this.adviceService.getAdvice("yerevan");
        Assertions.assertEquals(AdviceService.GO_AND_HAVE_A_WALK, advice);

    }

}
