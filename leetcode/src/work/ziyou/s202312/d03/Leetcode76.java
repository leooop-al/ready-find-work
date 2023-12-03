package work.ziyou.s202312.d03;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口法
 */
public class Leetcode76 {

    public static void main(String[] args) {
        Leetcode76 leetcode76 = new Leetcode76();
        System.out.println(leetcode76.minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> source = new HashMap<>(16);
        Map<Character, Integer> target = new HashMap<>(16);
        for (int i = 0; i < t.length(); i++) {
            Integer data = target.getOrDefault(t.charAt(i), 0);
            target.put(t.charAt(i), data + 1);
        }

        int valid = 0;
        int left = 0;
        int right = 0;
        int start = 0, minLen = Integer.MAX_VALUE;
        while (right < s.length()) {
            char cur = s.charAt(right);
            right++;
            if (target.containsKey(cur)) {
                Integer total = source.getOrDefault(cur, 0);
                source.put(cur, total + 1);
                if (source.get(cur).equals(target.get(cur))) {
                    valid++;
                }
            }

            while (target.size() == valid) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (source.containsKey(d)) {
                    if (source.get(d).equals(target.get(d))) {
                        valid--;
                    }
                    source.put(d, source.get(d) - 1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
