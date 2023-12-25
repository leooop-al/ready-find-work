package work.ziyou.s202312.d14;

import work.ziyou.TreeNode;

public class Leetcode104 {

    public static void main(String[] args) {
        Leetcode104 leetcode104 = new Leetcode104();
    }

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, int deep) {
        if (null == root) {
            return deep;
        }

        return Math.max(maxDepth(root.left, deep + 1), maxDepth(root.right, deep + 1));
    }
}
