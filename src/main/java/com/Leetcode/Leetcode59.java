package com.Leetcode;

public class Leetcode59 {
    public static void main(String[] args) {

    }

    /**
     * 旋转矩阵  给你一个正整数n，生成一个包含1到n2所有元素，且元素按顺时针顺序螺旋排列的n x n正方形矩阵 matrix
     * @param n
     * @return
     */
    public static int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while (num <= tar) {
            for (int i = l; i <= r; i++) {
                mat[t][i] = num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                mat[i][r] = num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                mat[b][i] = num++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                mat[i][l] = num++;
            }
            l++;
        }
        return mat;
    }
}
