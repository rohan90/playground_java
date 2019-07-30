package com.rohan90.playground.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class CountingValleysTest {

    @Test
    public void test1() {
        CountingValleysTest.Solution s = new Solution();
        String input = "UDDDUDUU";
        int result = s.countingValleys(input.length(), input);

        Assert.assertEquals(1, result);
    }

    class Solution {
        public int countingValleys(int n, String input) {
            if (n < 2 && n != input.length())
                return 0;

            AtomicInteger wentIntoValleyNTimes = new AtomicInteger();
            AtomicInteger level = new AtomicInteger();
            input.codePoints().mapToObj(c -> (char) c).forEach(c -> {
                switch (c) {
                    case 'D':
                        level.getAndDecrement();
                        if (level.get() == -1)
                            wentIntoValleyNTimes.getAndIncrement();

                        break;
                    case 'U':
                        level.getAndIncrement();
                        break;
                }
            });

            return wentIntoValleyNTimes.get();
        }
    }
}


