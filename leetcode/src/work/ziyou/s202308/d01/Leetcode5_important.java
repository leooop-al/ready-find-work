package work.ziyou.s202308.d01;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 *
 *
 * 多看几遍
 */
public class Leetcode5_important {

    public static void main(String[] args) {
        Leetcode5_important leetcode5 = new Leetcode5_important();
        System.out.println(leetcode5.longestPalindrome("cbbc"));
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        boolean[][] mark = new boolean[s.length()][s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    mark[i][j] = true;
                } else if (j - i == 1) {
                    mark[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    mark[i][j] = mark[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }
            }
        }

        int a = 0;
        int b = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (mark[i][j] && (j-i +1) > length) {
                    length = (j-i +1);
                    a = i;
                    b = j;
                }
            }
        }
        return s.substring(a, b+1);
    }
}
