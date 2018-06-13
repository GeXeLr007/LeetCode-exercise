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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        dummy1.next = l1;
        dummy2.next = l2;
        ListNode dummyout = new ListNode(-1);
        ListNode cur = dummyout;
        int jin = 0;
        while (dummy1.next != null || dummy2.next != null || jin != 0) {
            int v1 = 0, v2 = 0;
            if (dummy1.next != null) {
                dummy1 = dummy1.next;
                v1 = dummy1.val;
            }
            if (dummy2.next != null) {
                dummy2 = dummy2.next;
                v2 = dummy2.val;
            }
            int sum = v1 + v2 + jin;
            jin = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
        }

        return dummyout.next;

    }

}