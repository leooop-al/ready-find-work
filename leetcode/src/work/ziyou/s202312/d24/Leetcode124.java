package work.ziyou.s202312.d24;

import work.ziyou.TreeNode;

public class Leetcode124 {

    private int result = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Leetcode124 leetcode124 = new Leetcode124();
        System.out.println(leetcode124.maxPathSum(root));
    }

    public int maxPathSum(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode cur) {
        if (null == cur) {
            return;
        }
        helper(cur.left);
        helper(cur.right);

        int a = null == cur.left ? 0 : Math.max(0, cur.left.val);
        int b = null == cur.right ? 0 : Math.max(0, cur.right.val);
        result = Math.max(result, cur.val + a + b);
        cur.val = cur.val + Math.max(a, b);
        cur.val = Math.max(cur.val, 0);
    }
}
