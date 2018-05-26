import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 0, 0, 3, 4, 5};
        Solution solution = new Solution();

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != k) {
                    int t = nums[i];
                    nums[i] = nums[k];
                    nums[k] = t;
                    k++;
                } else {
                    k++;
                }
            }
        }
        return k;
    }

//    这种方式可以避免使用索引，更简洁
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int num : nums) {
            if (num != val) {
                nums[left++] = num;
            }
        }

        return left;
    }

//    给定值出现极少时的优化，面试可能会问如何进一步优化，可以这样解答
    public int removeElement(int[] nums, int val) {
        int right = nums.length;
        for (int i = 0; i < right; i++) {
            if (nums[i] == val) {
                nums[i] = nums[right - 1];
                right--;
                i--;
            }
        }

        return right;
    }

}