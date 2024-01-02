package work.ziyou.s202312.d28;

public class Leetcode136 {

    public int singleNumber(int[] nums) {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
