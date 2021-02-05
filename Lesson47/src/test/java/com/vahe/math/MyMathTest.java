package com.vahe.math;


import com.vahe.model.assertj.Employee;
import com.vahe.model.assertj.EmpoyeeGenerator;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MyMathTest {

    //https://assertj.github.io/doc/
    // hamcrest

    private MyMath myMath;

    @BeforeEach
    void init() {
        this.myMath = new MyMath();
    }

    @Test
    void testAdd() {
        int res = myMath.add(3, 4);

//        Assertions.assertEquals(7, res);
//        Assertions.assertTrue(res > 1 && res < 10);
//
//        String name = "vahe";
//
//        Assertions.assertTrue(name.startsWith("va"));
//        Assertions.assertTrue(name.endsWith("he"));


//        Assertions.assertTrue(res < 10);

        assertThat(res).isEqualTo(7);

        //Assertions.assertEquals(7, res);

        //assertThat(res).isEqualTo(9);
        assertThat(res).isBetween(1, 20);
        assertThat(res).isOdd();//assertTrue( res % 2 == 1);
        assertThat(res).isPositive(); // assertTrue(res > 0);

        assertThat(res).as("wrong  ..").isEqualTo(7);

        assertThat("The Lord of the Rings").isNotNull()
                .startsWith("The")
                .contains("Lord")
                .endsWith("Rings");

        assertThat("  ").containsOnlyWhitespaces();
        assertThat("vahe").hasSizeGreaterThan(2);

        List<String> list = List.of("vahe", "karen", "aram");

        assertThat(list)
                .contains("vahe")
                .doesNotContain("armine");

        assertThat("vahe     har").isEqualToIgnoringWhitespace("vahe har");
        //assertThat("vahe ksk").isEqualToIgnoringCase("VAHE KSK");

        assertThat(LocalDate.now()).isBefore(LocalDate.now().plusDays(1));
    }

    @Test
    public void test() {
        List<Employee> employees = EmpoyeeGenerator.get();

        assertThat(employees)
                .extracting(Employee::getAge)
                .anySatisfy(age -> {
                    assertThat(age).isGreaterThan(18);
                });
    }
}
