package work.ziyou.s202312.d13;

import work.ziyou.TreeNode;

public class Leetcode101 {

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }

        if (r1.val != r2.val) {
            return false;
        }

        return helper(r1.left, r2.right) && helper(r1.right, r2.left);
    }
}
