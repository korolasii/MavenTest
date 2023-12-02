package org.smth;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = Solution.twoSum(array, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIsPalindrome() {
        int number1 = -121;
        int number2 = 12321;
        assertFalse(Solution.isPalindrome(number1));
        assertTrue(Solution.isPalindrome(number2));
    }

    @Test
    public void testRomanToInt() {
        String roman1 = "X";
        String roman2 = "IX";
        int expected1 = 10;
        int expected2 = 9;
        assertEquals(expected1, Solution.romanToInt(roman1));
        assertEquals(expected2, Solution.romanToInt(roman2));
    }
}