import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 3, 4};
        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
        System.out.println(listNode);
        System.out.println(reverseKGroup(listNode, 1));

    }
    
    

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, post = dummy;
        while (pre.next != null) {
            boolean shouldreverse = true;
            for (int i = 0; i < k; i++) {
                if (post.next == null) {
                    shouldreverse = false;
                    break;
                }
                post = post.next;
            }
            if (shouldreverse) {
                post = post.next;
                ListNode n1 = null;
                ListNode n2 = pre.next;
                for (int i = 0; i < k; i++) {
                    ListNode n3 = n2.next;
                    n2.next = n1;
                    n1 = n2;
                    n2 = n3;
                }
                pre.next.next = post;
                ListNode nextfirst = pre.next;
                pre.next = n1;
                pre = nextfirst;
                post = pre;
            } else {
                return dummy.next;
            }
        }
        return dummy.next;

    }

}