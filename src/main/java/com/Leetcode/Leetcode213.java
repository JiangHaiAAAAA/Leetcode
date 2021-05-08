package com.Leetcode;

import java.util.Arrays;

public class Leetcode213 {
    public static void main(String[] args) {

    }

    /**
     * 打家劫舍2
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int a =
                ff(Arrays.copyOfRange(nums, 1, nums.length));
        int b = ff(Arrays.copyOfRange(nums, 0, nums.length - 1));
        return Math.max(a, b);

    }

    public int ff(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }

}
