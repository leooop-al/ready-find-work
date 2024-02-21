package work.ziyou.s202402.d19;

import work.ziyou.ListNode;

public class Leetcode234 {

    public static void main(String[] args) {
        Leetcode234 leetcode234 = new Leetcode234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean palindrome = leetcode234.isPalindrome(head);
        System.out.println(palindrome);
    }

    private boolean isPalindrome = true;

    private ListNode root = null;

    public boolean isPalindrome(ListNode head) {
        root = head;
        isPalindromeDeep(head);
        return isPalindrome;
    }

    private void isPalindromeDeep(ListNode tail) {
        if (null == tail) {
            return;
        }

        isPalindromeDeep(tail.next);
        if (!isPalindrome) {
            return;
        }
        if (tail.val != root.val) {
            isPalindrome = false;
        }
        root = root.next;
    }
}
