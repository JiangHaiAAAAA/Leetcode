package com.Leetcode;

import java.util.HashMap;

public class Leetcode1603 {

    public static void main(String[] args) {

    }

    /**
     * 请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
     * <p>
     * 请你实现 ParkingSystem  类：
     * <p>
     * ParkingSystem(int big, int medium, int small) 初始化ParkingSystem类，三个参数分别对应每种停车位的数目。
     * bool addCar(int carType)检查是否有carType对应的停车位。carType有三种类型：大，中，小，分别用数字1，2和3表示。
     * 一辆车只能停在carType对应尺寸的停车位中。如果没有空车位，请返回false，否则将该车停入车位并返回true
     */
    class ParkingSystem {
        HashMap<Integer, Integer> map = new HashMap<>();

        public ParkingSystem(int big, int medium, int small) {
            map.put(1, big);
            map.put(2, medium);
            map.put(3, small);
        }

        public boolean addCar(int carType) {
            if (map.get(carType) > 0) {
                map.put(carType, map.get(carType) - 1);
                return true;
            }
            return false;
        }
    }
}
