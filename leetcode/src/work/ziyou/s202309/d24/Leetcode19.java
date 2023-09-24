package work.ziyou.s202309.d24;

import work.ziyou.ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
class Leetcode19 {

    public static void main(String[] args) {
        Leetcode19 leetcode19 = new Leetcode19();

        ListNode h1 = new ListNode(1);
        h1.next = new ListNode(2);
        h1.next.next = new ListNode(3);
        h1.next.next.next = new ListNode(4);
        h1.next.next.next.next = new ListNode(5);


        ListNode listNode = leetcode19.removeNthFromEnd(h1, 2);

        System.out.println(listNode);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head) {
            return head;
        }

        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        // 如果删除的是第一个节点，则直接返回
        if (size == n) {
            return head.next;
        }

        // 否则进行删除
        ListNode prev = head;
        cur = head.next;
        int step = size - n;
        for (int i = 1; i < step; i++) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = cur != null ? cur.next : cur;
        return head;
    }
}
