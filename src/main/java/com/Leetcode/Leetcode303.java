package com.Leetcode;

public class Leetcode303 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(1,3));
    }

    /**
     * 给定一个整数数组 nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点
     */
    static class NumArray {
        int[] sums;

        public NumArray(int[] nums) {
            int n = nums.length;
            sums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }

    }
}


