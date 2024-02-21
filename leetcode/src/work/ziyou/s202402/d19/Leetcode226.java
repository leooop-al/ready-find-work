package work.ziyou.s202402.d19;

import work.ziyou.TreeNode;

public class Leetcode226 {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        deepInvertTree(root);
        return root;
    }

    private void deepInvertTree(TreeNode cur) {
        if (cur.left == null && cur.right == null) {
            return;
        }

        TreeNode left = cur.left;
        TreeNode right = cur.right;

        cur.left = right;
        cur.right = left;

        deepInvertTree(left);
        deepInvertTree(right);
    }
}
