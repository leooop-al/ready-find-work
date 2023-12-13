package work.ziyou.s202312.d12;

import work.ziyou.TreeNode;

public class Leetcode98 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long low, long height) {
        if (null == node) {
            return true;
        }

        if (node.val <= low || node.val >= height) {
            return false;
        }

        return helper(node.left, low, node.val) && helper(node.right, node.val, height);
    }
}
