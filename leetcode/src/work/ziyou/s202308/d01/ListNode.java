package work.ziyou.s202308.d01;

public class ListNode {
    protected int val;
    protected ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}