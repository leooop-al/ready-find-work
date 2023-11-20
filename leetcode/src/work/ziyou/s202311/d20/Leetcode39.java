package work.ziyou.s202311.d20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode39 {

    public static void main(String[] args) {
        Leetcode39 leetcode39 = new Leetcode39();
        System.out.println(leetcode39.combinationSum(new int[]{2, 2, 3, 6, 7}, 7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        deep(candidates, ans, new ArrayList<>(), 0, 0, target);
        return ans;
    }

    private void deep(int[] candidates, List<List<Integer>> ans, List<Integer> list, int index, int cur, int target) {
        if (cur == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (cur > target || index >= candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index) {
                if (candidates[i] == candidates[i - 1]) {
                    continue;
                }
            }
            int data = candidates[i];
            list.add(data);
            deep(candidates, ans, list, i, cur + data, target);
            list.remove(list.size() - 1);
        }
    }
}
