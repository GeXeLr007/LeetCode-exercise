/// Iterative 非递归
/// Time Complexity: O(n)
/// Space Complexity: O(1)

public class Solution {
    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
//        当传进来的head就是null时、只有一个node时都可以正确执行
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}