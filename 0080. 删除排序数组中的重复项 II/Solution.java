import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        Solution solution = new Solution();
        solution.removeDuplicates(arr);

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    //    cnt变量用来记录复制几个重复元素了
    public int removeDuplicates(int[] nums) {
        int k = 1, cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[k - 1]) {
                if (cnt < 2) {
                    nums[k] = nums[k - 1];
                    k++;
                    cnt++;
                }
            } else {
                cnt = 0;
                nums[k] = nums[i];
                k++;
                cnt++;
            }
        }
        return k;
    }

}