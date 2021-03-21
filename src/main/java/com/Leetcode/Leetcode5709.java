package com.Leetcode;

public class Leetcode5709 {
    public static void main(String[] args) {

    }

    /**
     * 最大升序子数组和
     * <p>
     * 给你一个正整数组成的数组 nums ，返回 nums 中一个 升序 子数组的最大可能元素和。
     * 子数组是数组中的一个连续数字序列。
     *
     * @param nums
     * @return
     */
    public int maxAscendingSum(int[] nums) {
        int res = nums[0], num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                num += nums[i];
            } else {
                num = nums[i];
            }
            res = Math.max(res, num);
        }
        return res;
    }
}
