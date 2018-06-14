import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 9, 1, 5, 9};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyAlmostDuplicate(arr1, 2, 3));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    在链表中用双指针维护窗口
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode end = dummy, start = dummy;
        for (int i = 0; i < n; i++) {
            end = end.next;
        }
        while (end.next != null) {
            start = start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return dummy.next;

    }

}