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
        Solution solution = new Solution();
        assertEquals(1, solution.romanToInt("I"));
    }

    @Test
    void test_III(){
        Solution solution = new Solution();
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void test_LIV(){
        Solution solution = new Solution();
        assertEquals(54, solution.romanToInt("LIV"));
    }

    @Test
    void test_VII(){
        Solution solution = new Solution();
        assertEquals(7, solution.romanToInt("VII"));
    }

    @Test
    void test_XVL(){
        Solution solution = new Solution();
        assertEquals(35, solution.romanToInt("XVL"));
    }

    @Test
    void test_XIV(){
        Solution solution = new Solution();
        assertEquals(14, solution.romanToInt("XIV"));
    }

    @Test
    void test_XVI(){
        Solution solution = new Solution();
        assertEquals(16, solution.romanToInt("XVI"));
    }

    @Test
    void test_XVII(){
        Solution solution = new Solution();
        assertEquals(17, solution.romanToInt("XVII"));
    }

    @Test
    void test_MCMXCIV(){
        Solution solution = new Solution();
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void test_LVIII(){
        Solution solution = new Solution();
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void test_IV(){
        Solution solution = new Solution();
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void test_MMCDXXV(){
        Solution solution = new Solution();
        assertEquals( 2425, solution.romanToInt("MMCDXXV"));
    }
}
