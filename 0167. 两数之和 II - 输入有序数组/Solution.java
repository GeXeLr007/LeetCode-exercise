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

    //    对撞指针
    public int[] twoSum1(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return null;

    }

    //    暴力解法
    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    //    利用二分搜索
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int find = target - numbers[i];
            int l = i + 1, r = numbers.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (numbers[mid] > find) {
                    r = mid - 1;
                } else if (numbers[mid] < find) {
                    l = mid + 1;
                } else {
                    return new int[]{i + 1, mid + 1};
                }
            }
        }
        return null;
    }

}