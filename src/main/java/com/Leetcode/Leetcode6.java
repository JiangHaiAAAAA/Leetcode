package com.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }
        int i = 0, falg = -1;
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            list.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                falg = -falg;
            }
            i += falg;
        }
        for (int j = 0; j < numRows; j++) {
            stringBuffer.append(list.get(j).toString());
        }
        return stringBuffer.toString();
    }
}
