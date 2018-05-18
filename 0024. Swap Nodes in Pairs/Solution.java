import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4};
//        int[] arr2 = {1, 3, 4};
        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
        System.out.println(listNode);
        System.out.println(swapPairs(listNode));

    }

//    多开几个辅助变量可以帮助解题、理清思路
//    https://algorithm.yuanbin.me/zh-hans/linked_list/swap_nodes_in_pairs.html
//    别人的递归思路很简洁优雅
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            ListNode n1 = pre.next, n2 = pre.next.next, post = pre.next.next.next;
            n2.next = n1;
            n1.next = post;
            pre.next = n2;
            pre = n1;
        }

        return dummy.next;

    }

}