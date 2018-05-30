import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("leetcode"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    贪心算法
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int result = Integer.MIN_VALUE;
        while (l < r) {
            result = Math.max(result, (r - l) * Math.min(height[l], height[r]));
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return result;

    }
    

}