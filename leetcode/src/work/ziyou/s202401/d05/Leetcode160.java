package work.ziyou.s202401.d05;

import work.ziyou.ListNode;

/**
 * 有一种方法很神奇
 */
public class Leetcode160 {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aStep = 0;
        int bStep = 0;

        ListNode cur = headA;
        while (cur != null) {
            aStep++;
            cur = cur.next;
        }

        cur = headB;
        while (cur != null) {
            bStep++;
            cur = cur.next;
        }

        while (aStep != bStep) {
            if (aStep > bStep) {
                headA = headA.next;
                aStep--;
            } else if (aStep < bStep) {
                headB = headB.next;
                bStep--;
            }
        }

        while (headA != headB) {
            if (headA == null || headB == null) {
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }

        if (headA != null && headB != null) {
            return headA;
        }
        return null;
    }
}
