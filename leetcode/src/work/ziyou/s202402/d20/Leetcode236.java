package work.ziyou.s202402.d20;

import work.ziyou.TreeNode;

public class Leetcode236 {

    private TreeNode target = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (search(p, q)) {
            return p;
        }
        if (search(q, p)) {
            return q;
        }

        lowestCommonAncestorDeep(root, p, q);
        return target;
    }

    private void lowestCommonAncestorDeep(TreeNode cur, TreeNode p, TreeNode q) {
        if (cur == null || target != null) {
            return;
        }
        lowestCommonAncestorDeep(cur.left, p, q);
        lowestCommonAncestorDeep(cur.right, p, q);

        if (target == null && search(cur, p) && search(cur, q)) {
            target = cur;
        }
    }

    private boolean search(TreeNode cur, TreeNode target) {
        if (null == cur) {
            return false;
        }

        if (cur == target) {
            return true;
        }

        return search(cur.left, target) || search(cur.right, target);
    }

}
