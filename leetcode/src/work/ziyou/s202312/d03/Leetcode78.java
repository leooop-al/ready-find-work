package work.ziyou.s202312.d03;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {

    public static void main(String[] args) {
        Leetcode78 leetcode78 = new Leetcode78();
        System.out.println(leetcode78.subsets(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recycle(ans, new ArrayList<>(), 0, nums);
        return ans;
    }

    private void recycle(List<List<Integer>> ans, List<Integer> data, int cur, int[]  nums) {
        ans.add(new ArrayList<>(data));

        for (int i = cur; i < nums.length; i++) {
            data.add(nums[i]);
            recycle(ans, data, i + 1, nums);
            data.remove(data.size()-1);
        }
    }
}
