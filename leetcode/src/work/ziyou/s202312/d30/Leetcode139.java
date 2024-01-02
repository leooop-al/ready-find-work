package work.ziyou.s202312.d30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 动态规划
 */
@Deprecated
public class Leetcode139 {

    public static void main(String[] args) {
        Leetcode139 leetcode139 = new Leetcode139();
        System.out.println(leetcode139.wordBreak("ccaccc", Arrays.asList("cc", "ac")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
