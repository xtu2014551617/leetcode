package me.xtu2014551617.problem029;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void divide() throws Exception {
        assertEquals(solution.divide(12, 6), 2);
        assertEquals(solution.divide(10, 6), 1);
        assertEquals(solution.divide(12, -3), -4);
        assertEquals(solution.divide(-12, 3), -4);
        assertEquals(solution.divide(-2, 5), 0);
        assertEquals(solution.divide(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
        assertEquals(solution.divide(Integer.MIN_VALUE, -1), Integer.MAX_VALUE);
    }
}


