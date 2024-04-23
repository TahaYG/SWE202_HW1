//B211202016
//Taha Yiğit Göksu
//SWE 202 SOFTWARE VERIFICATION AND VALIDATION
//2023-2024 SPRING SEMESTER
//HOMEWORK 1
//https://github.com/TahaYG/SWE202_HW1.git

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void testDivision2() {
        assertEquals(2.5, Calculator.divide(10, 4));
    }

    @Test
    void testDivision3() {
        assertEquals(5, Calculator.divide(12.5f, 2.5f));
    }

    @Test
    void testDivision4() {
        assertEquals(4, Calculator.divide(10, 2.5f));
    }

    @Test
    void testDivision5() {
        assertEquals(2.5f, Calculator.divide(12.5f, 5));
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }

        @ParameterizedTest
        @CsvSource({
                "10, 2, 5",
                "10, 4, 2.5",
                "12.5f, 2.5f, 5",
                "10, 2.5f, 4",
                "12.5f, 5, 2.5f"
        })
        public void testDivision(float dividend, float divisor, float expectedResult) {
            assertEquals(expectedResult, Calculator.divide(dividend, divisor));
        }
    }
