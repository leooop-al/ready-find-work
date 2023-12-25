package work.ziyou.s202312.d24;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {

    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};

        Leetcode128 leetcode128 = new Leetcode128();
        System.out.println(leetcode128.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum+1)) {
                    currentNum ++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
