package com.rohan90.playground_java.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumOfIntegersTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] array = new int[]{1, 2, 3,};
        int result = s.solution(array);

        Assert.assertEquals(6, result);
    }

    class Solution {
        public int solution(int[] ar) {
            final int[] sum = {0};
            Arrays.stream(ar).forEach(a -> sum[0] = sum[0] + a);

            return sum[0];
        }
    }
}
