package work.ziyou.s202309.d25;

import work.ziyou.ListNode;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 */
public class Leetcode20 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        Leetcode20 leetcode21 = new Leetcode20();
        ListNode listNode1 = leetcode21.mergeTwoLists(listNode, listNode2);

        System.out.println(listNode1);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode cur = new ListNode(0);
        ListNode root = cur;
        while (list1 != null && list2 != null) {
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;

            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = next1;
            } else {
                cur.next = list2;
                list2 = next2;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;

        return root.next;
    }
}
