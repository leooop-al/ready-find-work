package work.ziyou.s202311.d20;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    public static void main(String[] args) {
        Leetcode46 leetcode46 = new Leetcode46();
        List<List<Integer>> permute = leetcode46.permute(new int[]{1, 2, 3, 4});
        System.out.println(permute.size());
        System.out.println(permute);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] mark = new boolean[nums.length];
        deep(nums, ans, new ArrayList<>(), mark);
        return ans;
    }

    private void deep(int[] nums, List<List<Integer>> ans, List<Integer> list, boolean[] mark) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (list.size() > nums.length) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (mark[i]) {
                continue;
            }
            list.add(nums[i]);
            mark[i] = true;
            deep(nums, ans, list, mark);
            list.remove(list.size() - 1);
            mark[i] = false;
        }
    }
}
