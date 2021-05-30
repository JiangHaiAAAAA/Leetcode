package com.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode56 {
    public static void main(String[] args) {

    }

    /**
     * 合并区间
     *
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[][] res = new int[intervals.length][0];
        int index = -1;
        for (int[] interval : intervals) {
            if (index == -1 || interval[0] > res[index][1]) {
                index++;
                res[index] = interval;
            } else {
                res[index][1] = Math.max(res[index][1], interval[1]);
            }
        }

        return Arrays.copyOf(res, index + 1);
    }
}
