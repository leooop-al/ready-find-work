package work.ziyou.s202401.d01;

import work.ziyou.ListNode;

public class Leetcode147 {

    public static void main(String[] args) {
        Leetcode147 leetcode171 = new Leetcode147();

        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(0);

        ListNode listNode1 = leetcode171.insertionSortList(listNode);
    }

    public ListNode insertionSortList(ListNode head) {

        if (null == head || null == head.next) {
            return head;
        }

        ListNode root = new ListNode(0);
        root.next = head;

        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (prev.val > cur.val) {
                ListNode next = cur.next;
                ListNode a = root;
                ListNode b = root.next;
                while (b.val <= cur.val) {
                    a = b;
                    b = b.next;
                }

                a.next = cur;
                b.next = b == prev ? cur.next : b.next;
                cur.next = b;
                prev.next = next;

                if (null != next) {
                    prev = b;
                    cur = b.next;
                }else {
                    prev.next = null;
                    break;
                }
            } else {
                prev = cur;
                cur = cur.next;
            }

        }

        return root.next;
    }
}