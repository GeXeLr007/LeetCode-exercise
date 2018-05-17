public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println(oddEvenList(listNode));

    }
    
    
//利用两个指针
    public static ListNode oddEvenList(ListNode head) {
        ListNode odddummy = new ListNode(0);
        ListNode evendummy = new ListNode(0);
        ListNode oddcur = odddummy;
        ListNode evencur = evendummy;
        int index = 1;
        ListNode node = head;
        while (node != null) {
            if (index % 2 == 1) {
                oddcur.next = node;
                oddcur = node;
            } else {
                evencur.next = node;
                evencur = node;
            }
            index++;
            node = node.next;
        }
        oddcur.next = evendummy.next;
        evencur.next = null;
        return odddummy.next;

    }

}