package work.ziyou.s202312.d31;

import work.ziyou.ListNode;

import java.util.Stack;

public class Leetcode143 {

    public static void main(String[] args) {
        Leetcode143 leetcode143 = new Leetcode143();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        leetcode143.reorderList(listNode);

        System.out.println(listNode);
    }

    public void reorderList(ListNode head) {
        if (null == head || null == head.next) {
            return;
        }

        Stack<ListNode> stacks = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stacks.push(cur);
            cur = cur.next;
        }

        cur = head;
        int looop = stacks.size() / 2;
        while (looop > 0) {
            ListNode tail = stacks.pop();
            ListNode next = cur.next;
            cur.next = tail;
            tail.next = next;

            cur = tail.next;

            looop--;
        }
        if (cur != null) {
            cur.next = null;
        }
    }
}
