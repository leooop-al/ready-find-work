package work.ziyou.s202312.d04;

import work.ziyou.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();

        Leetcode94 leetcode94 = new Leetcode94();
        System.out.println(leetcode94.inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal(ans, root);
        return ans;
    }

    private void inorderTraversal(List<Integer> res, TreeNode root) {
        if (null == root) {
            return;
        }
        inorderTraversal(res, root.left);
        res.add(root.val);
        inorderTraversal(res, root.right);
    }
}
