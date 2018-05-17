public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println(deleteDuplicates(listNode));

    }

//https://algorithm.yuanbin.me/zh-hans/linked_list/remove_duplicates_from_sorted_list_ii.html
//  别人的巧妙方法，记录带删除的节点们的值，不断比较pre节点的后一个节点是否和值相等，若想等则删除。
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy,cur=pre.next;
        while (pre.next!=null){
            boolean hasdelete=false;
            cur=pre.next;
            while (cur.next!=null && cur.val==cur.next.val){
                cur.next=cur.next.next;
                hasdelete=true;
            }
            if (hasdelete){
                pre.next=cur.next;
            }else {
                pre =cur;
            }
        }

        return dummy.next;
    }
    
    
    
    

}