public class Solution {

    public static void main(String[] args) {

        int[] arr = {1};
        int[] arr2 = {9, 9};
        ListNode listNode = new ListNode(arr);
        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
        System.out.println(addTwoNumbers(listNode, listNode2));

    }

    // 要考虑两个链表长度不一样，考虑进位数，以及两个链表都到达结尾但是进位数不为0 
//    询问面试官是否有考虑前置0
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode dummynew = new ListNode(0);
        ListNode cur = dummynew;
        dummy1.next = l1;
        dummy2.next = l2;
        int jin = 0;
        while ((dummy1.next != null || dummy2.next != null) || jin != 0) {
            int t1 = 0, t2 = 0;
            if (dummy1.next != null) {
                dummy1 = dummy1.next;
                t1 = dummy1.val;
            }
            if (dummy2.next != null) {
                dummy2 = dummy2.next;
                t2 = dummy2.val;
            }

            ListNode node = new ListNode((t1 + t2 + jin) % 10);
            jin = (t1 + t2 + jin) / 10;
            dummynew.next = node;
            dummynew = node;

        }
        return cur.next;

    }

}