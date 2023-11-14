package work.ziyou.s202311.d13;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 */
public class Leetcode21 {

    public static void main(String[] args) {
        Leetcode21 leetcode21 = new Leetcode21();
        System.out.println(leetcode21.generateParenthesis(2));
    }


    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();
        deep(ans, 0, n, "");
        return ans;
    }

    private void deep(List<String> ans, int cur, int n, String s) {
        if (cur == 0 && s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (s.length() > 2 * n) {
            return;
        }

        if (cur > n) {
            return;
        }

        if (cur < 0) {
            return;
        }
        deep(ans, cur +1, n, s + "(");
        deep(ans, cur -1, n, s + ")");
    }
}
