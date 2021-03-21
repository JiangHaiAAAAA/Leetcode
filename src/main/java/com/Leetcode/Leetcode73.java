package com.Leetcode;

public class Leetcode73 {

    public static void main(String[] args) {

    }


    /**
     * 矩阵归零
     * <p>
     * 给定一个mxn的矩阵，如果一个元素为0，则将其所在行和列的所有元素都设为0。请使用原地算法
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
