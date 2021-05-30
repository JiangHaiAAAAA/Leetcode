package com.Leetcode;

public class Leetcode11 {
    public static void main(String[] args) {

    }

    /**
     * 最大的容器
     * 双指针法
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int res = 0;
        int L = 0, R = height.length - 1;
        while (L < R) {
            res = Math.max(res, (R - L) * Math.min(height[R], height[L]));
            if (height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }
        return res;
    }
}
