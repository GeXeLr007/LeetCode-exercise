import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1};
        int[] arr2 = {9,9};
        ListNode listNode = new ListNode(arr);
        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
        System.out.println(addTwoNumbers(listNode, listNode2));

    }

//    使用两次栈，两数相加问题，数字逆序存储要容易计算。
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int jin = 0;
        Stack<Integer> out = new Stack<>();
        while (!s1.isEmpty() || !s2.isEmpty() || jin != 0) {
            int t1 = 0, t2 = 0;
            if (!s1.isEmpty()) {
                t1 = s1.pop();
            }
            if (!s2.isEmpty()) {
                t2 = s2.pop();
            }
            int sum = t1 + t2 + jin;
            out.push(sum % 10);
            jin = sum / 10;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!out.isEmpty()) {
            cur.next = new ListNode(out.pop());
            cur = cur.next;
        }
        return dummy.next;

    }

}