package work.ziyou.s202401.d02;

import work.ziyou.ListNode;

/**
 * 归并排序
 */
@Deprecated
public class Leetcode148 {

    public static void main(String[] args) {
        Leetcode148 leetcode148 = new Leetcode148();
        leetcode148.sortList(new ListNode(1));
    }

    public ListNode sortList(ListNode head) {

        return merge(head, null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (null == head || head.next == null) {
            return head;
        }

        if (head.next == tail) {
            head.next = null;
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        return merge(list1, list2);
    }

    private ListNode merge(ListNode cur1, ListNode cur2) {
        if (null == cur1) {
            return cur2;
        }
        if (null == cur2) {
            return cur1;
        }
        ListNode root = new ListNode(0);
        ListNode temp = root;
        ListNode temp1 = cur1;
        ListNode temp2 = cur2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null) {
            temp.next = temp1;
        }
        if (temp2 != null) {
            temp.next = temp2;
        }
        return root.next;
    }
}
