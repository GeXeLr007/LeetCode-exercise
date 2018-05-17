public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //    1 ≤ m ≤ n ≤ length of list.   和面试官沟通，m>n, m，n大于链表长度，小于0的情况是返回null还是自行转换为链表长度或0
//    画图理清思路，明确需要哪些辅助变量。把中间的一段链表逆序，然后和两头的相连接
// 其他解法待学习
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode mnode = dummyhead;
        for (int i = 0; i < m - 1; i++) {
            mnode = mnode.next;
        }
        ListNode pre = null, cur = mnode.next;
        for (int i = 0; i < n - m + 1; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
//        巧妙获取到翻转链表的尾节点，不必再准备一个辅助变量存储翻转链表的头结点（即翻转后的尾节点）
        mnode.next.next = cur;
        mnode.next = pre;

        return dummyhead.next;
    }
}