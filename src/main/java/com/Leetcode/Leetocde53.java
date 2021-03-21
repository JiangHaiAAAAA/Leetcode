package com.Leetcode;

public class Leetocde53 {
    public static void main(String[] args) {

    }

    /**
     * 最大子序和
     *
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int res = 0;
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (num > 0) {
                num += nums[i];
            } else {
                num = nums[i];
            }

            res = Math.max(res, num);
        }
        return res;
    }
}
