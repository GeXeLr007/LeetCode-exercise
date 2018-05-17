public class Solution {

    public static void main(String[] args) {

        int[] arr = {};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println(deleteDuplicates(listNode));

    }

//    这种方法更简洁
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = pre.next;
        while (cur != null) {
            ListNode next = cur.next;
            if (next != null && cur.val == next.val) {
                pre.next = next;
                cur = next;
            } else {
                pre = cur;
                cur = next;
            }
        }

        return dummy.next;

    }

}