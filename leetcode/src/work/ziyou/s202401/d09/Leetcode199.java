package work.ziyou.s202401.d09;

import work.ziyou.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode199 {

    public static void main(String[] args) {
        Leetcode199 leetcode199 = new Leetcode199();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);

        leetcode199.rightSideView(treeNode);

    }

    public List<Integer> rightSideView(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        deep(root, ans, 0);
        return ans;
    }

    private void deep(TreeNode root, List<Integer> ans, int level) {
        if (root == null) {
            return;
        }

        if (ans.size() <= level) {
            ans.add(root.val);
        }

        deep(root.right, ans, level + 1);
        deep(root.left, ans, level + 1);
    }
}
