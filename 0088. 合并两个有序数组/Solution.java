import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        solution.merge(arr1, 5, arr2, 1);

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, w = 0;  //w变量作为新插入到数组中的元素的索引,i变量表示处理了几个nums1的元素，j变量表示处理了几个nums2的元素
        while (i < m && j < n) {
            if (nums2[j] < nums1[w]) {
                for (int k = m + j; k > i + j; k--) {
                    nums1[k] = nums1[k - 1];
                }
                nums1[w++] = nums2[j];
                j++;
            } else {
                i++;
                w++;
            }
        }
        if (j != n) {
            while (j != n) {
                nums1[w++] = nums2[j++];
            }
        }
    }

    //    可以从后往前考虑
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[index--] = nums1[m - 1];
                m--;
            } else {
                nums1[index--] = nums2[n - 1];
                n--;
            }
        }
        if (n != 0) {
            while (n != 0) {
                nums1[index--] = nums2[n - 1];
                n--;
            }
        }
    }

}