import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(7, arr1));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    双指针，初始状态双指针不包含任何元素，终止条件是双指针对撞到一起
//    另一种解法
//    https://github.com/liuyubobobo/Play-Leetcode/blob/master/0209-Minimum-Size-Subarray-Sum/java-0209/src/Solution2.java
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }
            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }
        }

        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;

    }

}