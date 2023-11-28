package work.ziyou.s202311.d23;

import java.util.*;

public class Leetcode49 {

    public static void main(String[] args) {
        Leetcode49 leetcode49 = new Leetcode49();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(leetcode49.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = new HashMap<>(16);

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = String.valueOf(chars);

            List<String> data = maps.getOrDefault(sortStr, new ArrayList<>());
            data.add(str);
            maps.putIfAbsent(sortStr, data);
        }
        return new ArrayList<>(maps.values());
    }
}
