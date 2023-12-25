package work.ziyou.s202312.d18;

import work.ziyou.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

@Deprecated
public class Leetcode114 {

    public static void main(String[] args) {
        Leetcode114 leetcode114 = new Leetcode114();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right= new TreeNode(4);

        treeNode.right= new TreeNode(5);
        treeNode.right.right= new TreeNode(6);

        leetcode114.flatten(treeNode);
    }

    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode right = cur.right;
            TreeNode left = cur.left;

            cur.right = left == null ? right : left;
            cur.left = null;

            if (null != left) {
                queue.add(left);
            }
            if (null != right) {
                queue.add(right);
            }
        }
    }

    private void deep(TreeNode cur) {
        if (null == cur) {
            return;
        }
        TreeNode left = cur.left;
        TreeNode updateRight = cur.right;
        cur.right = left == null ? updateRight : left;
        cur.left = null;
        deep(cur.right);
    }
}
