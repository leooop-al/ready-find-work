package work.ziyou.s202308.d01;

import work.ziyou.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Leetcode2 {

    public static void main(String[] args) {
        ListNode root1 = new ListNode(2);
        root1.next = new ListNode(4);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(5);


        ListNode root2 = new ListNode(5);
        root2.next = new ListNode(6);
        root2.next.next = new ListNode(4);

        Leetcode2 leetcode2 = new Leetcode2();
        ListNode listNode = leetcode2.addTwoNumbers(root1, root2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int point = 0;

        ListNode root = l1;
        ListNode cur = l1;
        while (l1 != null || l2 != null) {
            int x = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + point) / 10;
            cur.val = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + point) % 10;

            point = x;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            if (l1 == null && l2 == null) {
                break;
            }

            cur.next = null != l1 ? l1 : l2;
            cur = cur.next;
        }

        if (point != 0) {
            cur.next = new ListNode(point);
        }

        return root;
    }

}
