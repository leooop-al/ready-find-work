package work.ziyou.s202401.d23;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode215 {

    public static void main(String[] args) {
        Leetcode215 leetcode215 = new Leetcode215();
        leetcode215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int num : nums) {
            if (pq.size() >= k) {
                Integer peek = pq.peek();
                if (peek < num) {
                    pq.poll();
                    pq.add(num);
                }
            } else {
                pq.add(num);
            }
        }
        return pq.poll();
    }
}
