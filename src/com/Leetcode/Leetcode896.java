package com.Leetcode;

public class Leetcode896 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(isMonotonic(arr));
    }

    /**
     * 数组是否单调递增或者递减
     * @param A
     * @return
     */
    public static boolean isMonotonic(int[] A) {
        return isIncreasing(A) || isDecreasing(A);
    }

    public static boolean isIncreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                return false;
            }
        }
        return false;
    }
}
