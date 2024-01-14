package work.ziyou.s202401.d14;

import work.ziyou.ListNode;

public class Leetcode206 {

    public static void main(String[] args) {
        Leetcode206 leetcode206 = new Leetcode206();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        ListNode listNode1 = leetcode206.reverseListDeep(listNode);
        System.out.println(listNode1);
    }

    private ListNode root = null;

    public ListNode reverseList(ListNode head) {
        reverseListDeep(head);
        return root;
    }

    private ListNode reverseListDeep(ListNode cur) {
        if (cur == null) {
            return null;
        }
        ListNode data = reverseListDeep(cur.next);
        if (data != null) {
            data.next = cur;
            cur.next = null;
        }
        data = cur;
        if (null == root) {
            root = data;
        }
        return data;
    }

}
