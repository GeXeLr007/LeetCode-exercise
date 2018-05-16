public class Solution {
    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    
    public ListNode reverseList(ListNode head) {
//        null链表和只有一个node的链表在第一次判定递归终止条件时就返回了
        if (head==null||head.next==null) return head;
        ListNode p = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;

    }
}