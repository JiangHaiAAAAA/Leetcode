package com.Leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode347 {
    public static void main(String[] args) {

    }

    /**
     * 出现次数最多的元素
     * 最大堆实现，同理最小堆实现出现最少的元素
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(02);
            }
        });
        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.remove();
        }
        return arr;
    }
}
