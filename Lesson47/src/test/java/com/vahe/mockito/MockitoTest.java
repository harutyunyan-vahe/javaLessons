package com.vahe.mockito;


import com.vahe.model.assertj.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    void test() {
        Employee mockEmployee = Mockito.mock(Employee.class);

        System.out.println(mockEmployee.getName());
        System.out.println(mockEmployee.getAge());
        mockEmployee.setAge(444);

        when(mockEmployee.getName()).thenReturn("Karen");
        when(mockEmployee.getAge()).thenReturn(333);

        System.out.println(mockEmployee.getName());
        System.out.println(mockEmployee.getAge());

//        //Mockito.when(mock.getAge()).thenReturn(66);
//        when(mock.getName()).thenReturn("vahe");
//
//        mock.setAge(33);
//        Assertions.assertEquals(0, mock.getAge());
//        Assertions.assertEquals("vahe", mock.getName());
//
//        //  verifyNoInteractions(mock);
//        verify(mock).getAge();

    }
}
