import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 3, 4};
        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for (Integer inte :
                set2) {
            result[i] = inte;
            i++;
        }
        return result;

    }

}