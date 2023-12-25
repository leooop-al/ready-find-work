package work.ziyou.s202312.d14;

import work.ziyou.TreeNode;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Leetcode105 {

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        Leetcode105 leetcode105 = new Leetcode105();
        TreeNode treeNode = leetcode105.buildTree(preorder, inorder);
        System.out.println("finish");
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, 0, inorder.length-1);
    }


    private TreeNode buildTree(int[] preorder, int[] inorder, int cur, int left, int right) {
        if (cur >= preorder.length) {
            return null;
        }
        int pIndex = -1;
        int iIndex = -1;
        boolean find = false;
        for (int i = cur; i < preorder.length; i++) {
            for (int j = left; j <= right; j++) {
                if (inorder[j] == preorder[i]) {
                    pIndex = i;
                    iIndex = j;
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }

        if (!find) {
            return null;
        }

        TreeNode treeNode = new TreeNode(preorder[pIndex]);
        treeNode.left = buildTree(preorder, inorder, pIndex + 1,0, iIndex - 1);
        treeNode.right = buildTree(preorder, inorder, pIndex + 1, iIndex + 1, right);
        return treeNode;
    }
}
