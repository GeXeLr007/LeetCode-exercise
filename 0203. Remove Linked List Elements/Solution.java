public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,2,6,3,4,5,6};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println(removeElements(listNode,6));

    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while (cur.next!=null){
            if (cur.next.val==val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return dummy.next;

    }
    
    
    
    

}