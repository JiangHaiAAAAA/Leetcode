package com.Leetcode;

public class Leetcode190 {

    public static void main(String[] args) {

    }

    /**
     * 颠倒给定的 32 位无符号整数的二进制位
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
