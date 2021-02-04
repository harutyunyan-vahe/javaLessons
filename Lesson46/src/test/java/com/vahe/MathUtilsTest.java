package com.vahe;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//Java Brains
//https://www.youtube.com/playlist?list=PLqq-6Pq4lTTa4ad5JISViSb2FVG8Vwa4o
//
//https://junit.org/junit5/docs/current/user-guide/

@DisplayName("Math utils testing")
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

    private MathUtils mathUtils;

    public MathUtilsTest() {
        System.out.println("Constructor ...");
    }

    @BeforeAll
    static void beforeAllInit() {
        System.out.println("Before all ... ");
    }

    @AfterAll
    static void afterAllInit() {
        System.out.println("After  all ... ");
    }


    @BeforeEach
    public void init() {
        System.out.println("init");
        this.mathUtils = new MathUtils();
    }

    @AfterEach
    void after() {
        System.out.println("After each ...");
    }

    @Nested
    class AddMethodTest {
        @Test
        void testAddMethodWithPositivNumber() {
            //MathUtils mathUtils = new MathUtils();
            int result = mathUtils.add(4, 2);
            assertEquals(6, result);
        }

        @Test
        void testAddMethodWithNegativNumber() {

            //MathUtils mathUtils = new MathUtils();
            int result = mathUtils.add(-4, -2);
            assertEquals(-6, result);
        }
    }


    @Test
    @DisplayName("Test minus method")
    void testMinusMethod() {
        //MathUtils mathUtils = new MathUtils();
        int result = mathUtils.minus(10, 2);
        assertEquals(8, result, "Minus method is not working ");

        boolean b = true;
//        assertEquals(true, b);
//        assertTrue(b);
//        assertNull();

        //assertArrayEquals();
        //  assertIterableEquals();
    }

    @Test
//    @Disabled("Disabled temporary , fIX ")
//    @EnabledOnOs(OS.WINDOWS)
//    @DisabledOnOs(OS.LINUX)
//    @EnabledOnJre(JRE.JAVA_14)
    void testMultiply() {
        //MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    @Tag("integeration")
    void testWithAssamption() {
        //MathUtils mathUtils = new MathUtils();

        boolean isUP = false;// server.get();
        Assumptions.assumeTrue(isUP);

        assertEquals(1, 3);
    }

    @Test
    @RepeatedTest(3)
    void testDivide() {

        assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(5, 0);
        });
    }

    @Test
    void assertMulip() {
        assertAll(() -> assertEquals(6, mathUtils.add(2, 4)),
                () -> assertEquals(13, mathUtils.add(9, 4))

        );
    }
}
