import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode listNode = new ListNode(arr);
        ListNode listNode2 = new ListNode(arr2);
        System.out.println(listNode);
        System.out.println(mergeTwoLists(listNode, listNode2));

    }

    //    别人的解法很简洁。最后有一个链表为空则将另一条链表整个连接到新链表里
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        dummy1.next = l1;
        dummy2.next = l2;

        while (dummy1.next != null && dummy2.next != null) {
            int t1 = dummy1.next.val, t2 = dummy2.next.val;
            if (t1 <= t2) {
                dummy1 = dummy1.next;
                ListNode node = new ListNode(t1);
                cur.next = node;
                cur = node;
            } else {
                dummy2 = dummy2.next;
                ListNode node = new ListNode(t2);
                cur.next = node;
                cur = node;
            }
        }
        if (dummy1.next != null) {
            cur.next = dummy1.next;
        } else if (dummy2.next != null) {
            cur.next = dummy2.next;
        }

        return dummy.next;

    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while ((l1 != null) && (l2 != null)) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        // link to non-null list
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

}