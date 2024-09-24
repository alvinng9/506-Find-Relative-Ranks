package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findRelativeRanksTest() {
        Solution solution = new Solution();
        assertEquals(new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"},
                solution.findRelativeRanks(new int[]{5,4,3,2,1}));
        assertEquals(new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"},
                solution.findRelativeRanks(new int[]{10,3,8,9,4}));
    }

}