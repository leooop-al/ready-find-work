package work.ziyou.s202308.d01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ziyou.cxf
 * @version : Leetcode3.java, v 0.1 2023年07月31日 9:03 ziyou.cxf Exp $
 * @desc : 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 *
 * 2023/7/31 一把过
 */
public class Leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        // 先判断边界条件
        if (null == s || s.length() == 0) {
            return 0;
        }

        int maxLength = 1;
        int start = -1;
        Map<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (maps.containsKey(c)) {
                int next = maps.get(c);
                if (next > start) {
                    // trick 只有当next大于start，才进行比较，否则进行覆盖，剔除
                    maxLength = Math.max(i - start -1, maxLength);
                    start = next;
                }
            }
            maps.put(c, i);
        }

        // 特殊情况，当没有执行maps.containsKey(c)时
        maxLength = Math.max(s.length() - start - 1, maxLength);

        return maxLength;
    }
}
