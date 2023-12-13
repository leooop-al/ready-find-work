package work.ziyou.s202312.d13;

import work.ziyou.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode102 {

    public static void main(String[] args) {
        Leetcode102 leetcode102 = new Leetcode102();
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();

        List<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        while (temp.size() > 0) {
            int size = temp.size();
            List<Integer> data = new ArrayList<>();
            while (size > 0) {
                TreeNode node = temp.remove(0);
                data.add(node.val);
                size--;
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            ans.add(data);
        }
        return ans;
    }
}
