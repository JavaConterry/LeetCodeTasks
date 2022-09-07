package com.conterry.test;

import com.conterry.RomanToInteger.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTests {

    Solution solution;

    @BeforeEach
    void setUp(){
        solution = new Solution();
    }

    @Test
    void test_I(){
        assertEquals(1, solution.romanToInt("I"));
    }

    @Test
    void test_III(){
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void test_LIV(){
        assertEquals(54, solution.romanToInt("LIV"));
    }

    @Test
    void test_VII(){
        assertEquals(7, solution.romanToInt("VII"));
    }

    @Test
    void test_XIV(){
        assertEquals(14, solution.romanToInt("XIV"));
    }

    @Test
    void test_XVI(){
        assertEquals(16, solution.romanToInt("XVI"));
    }

    @Test
    void test_XVII(){
        assertEquals(17, solution.romanToInt("XVII"));
    }

    @Test
    void test_MCMXCIV(){
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void test_LVIII(){
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void test_IV(){
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void test_MMCDXXV(){
        assertEquals( 2425, solution.romanToInt("MMCDXXV"));
    }
}
