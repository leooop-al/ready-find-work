package work.ziyou.s202312.d30;

import work.ziyou.ListNode;

public class Leetcode142 {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        do {
            first = first.next;
            second = second.next;
            second = second != null ? second.next : null;
            if (first == second) {
                break;
            }
        } while (null != first && null != second);

        if (first == null || second == null) {
            return null;
        }
        second = head;
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }
}
