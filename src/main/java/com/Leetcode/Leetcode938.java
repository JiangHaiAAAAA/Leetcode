package com.Leetcode;

import com.common.TreeNode;

import java.util.ArrayList;

public class Leetcode938 {


    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= high && list.get(i) >= low) {
                res += list.get(i);
            }
        }
        return res;
    }

    public static void dfs(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }
        dfs(node.left, list);
        list.add(list);
        dfs(node.right, list);
    }

}
