package com.conterry.RomanToInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {

    Map<Character, Integer> romanMap = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        char[] romanNums = s.toCharArray();
        List<Integer> decNums = new ArrayList<Integer>();
        for(char rom : romanNums) {
            decNums.add(romanMap.get(rom));
        }
        int i = 1;
        int sum = decNums.stream().reduce(0, (a, b) -> a + b);
        if(sum != 3) {
            if (romanNums.length > 2) {
                while (i < decNums.size() - 1) {
                    int first = decNums.get(i - 1);
                    int second = decNums.get(i);
                    int third = decNums.get(i + 1);
                    int min = Math.min(Math.min(first, second), Math.min(third, second));
                    if (min == second && min != third) {
                        sum -= 2 * second;
                    }
                    if (first < third) {
                        sum -= 2 * first;
                    }
                    i += 2;
                }
            }
            else if(decNums.size() == 2){
                int first = decNums.get(0);
                int second = decNums.get(1);
                if(first < second) {
                    sum -= 2*first;
                }
            }
        }

        return sum;
    }

}