package com.rohan90.playground_java.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SockPairsTest {

    @Test
    public void test1_sockPairs() {
        Solution s = new Solution();
        int[] array = new int[]{1, 2, 3, 4, 5, 1};
        int result = s.solution(6, array);

        Assert.assertEquals(1, result);
    }

    class Solution {
        public int solution(int n, int[] ar) {
            if (n != ar.length)
                return 0;
            List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
            HashMap<Integer, Integer> map = new HashMap<>();
            final int[] pairs = {0};

            list.forEach(a -> {
                if (!map.containsKey(a)) {
                    map.put(a, 1);
                } else {
                    pairs[0]++;
                    map.remove(a);
                }
            });

            return pairs[0];
        }
    }
}

