package com.vahe.weather;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseTest {

    private AutoCloseable autoCloseable;

    @BeforeEach
    public void before() {
        this.autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void after() throws Exception {
        this.autoCloseable.close();
    }
}
