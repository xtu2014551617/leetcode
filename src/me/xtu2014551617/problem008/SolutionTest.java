package me.xtu2014551617.problem008;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void myAtoiTest() throws Exception {
        assertEquals(solution.myAtoi("4193 with words"), 4193);
        assertEquals(solution.myAtoi("words and 987"), 0);
        assertEquals(solution.myAtoi("-91283472332"), -2147483648);
        assertEquals(solution.myAtoi("42"), 42);
        assertEquals(solution.myAtoi("   -42"), -42);
    }
}

