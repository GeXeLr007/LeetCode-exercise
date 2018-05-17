public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5,2};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
        System.out.println(partition(listNode,3));

    }

//    https://algorithm.yuanbin.me/zh-hans/linked_list/partition_list.html
//    别人的解法，使用两个dummy，若小于x则该节点接到dummy1的链表里，若大于等于x则该节点接到dummy2的链表里
    public static ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy,newdummy=new ListNode(0),pre=newdummy;
        while (cur.next!=null){
            if (cur.next.val<x){
                cur=cur.next;
            }else{
                ListNode tmp=cur.next;
                cur.next=cur.next.next;
                tmp.next=null;
                pre.next=tmp;
                pre=tmp;
            }
        }
        cur.next=newdummy.next;
        return dummy.next;
    }


}