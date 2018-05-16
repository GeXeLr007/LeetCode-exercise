/// Recursive 递归实现
/// Time Complexity: O(n)
/// Space Complexity: O(n)

//Let's assume the list is: n1 → … → nk-1 → nk → nk+1 → … → nm → Ø
//
//        Assume from node nk+1 to nm had been reversed and you are at node nk.
//
//        n1 → … → nk-1 → nk → nk+1 ← … ← nm
//
//        We want nk+1’s next node to point to nk.
//
//        So,
//
//        nk.next.next = nk;
//
//        Be very careful that n1's next must point to Ø. If you forget about this, your linked list has a cycle in it. This bug could be caught if you test your code with a linked list of size 2.


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
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }
}