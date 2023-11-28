package work.ziyou.s202311.d28;

import java.util.*;

public class Leetcode56 {

    public static void main(String[] args) {
        Leetcode56 leetcode56 = new Leetcode56();

        int[][] data = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        leetcode56.merge(data);
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (array1, array2) -> {
            if (array1[0] != array2[0]) {
                return array1[0] < array2[0] ? -1 : 1;
            }
            if (array1[1] == array2[1]) {
                return 0;
            }
            return array1[1] < array2[1] ? -1 : 1;
        });

        List<List<Integer>> result = new ArrayList<>();

        int a = intervals[0][0];
        int b = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (b < intervals[i][0]) {
                result.add(Arrays.asList(a, b));
                a= intervals[i][0];
                b = intervals[i][1];
            }else {
                b = Math.max(b, intervals[i][1]);
            }
        }
        result.add(Arrays.asList(a, b));

        System.out.println(result);

        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }
        return ans;
    }

}
