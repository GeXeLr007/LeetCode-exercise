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

    public void sortColors(int[] nums) {
        int zero = -1, two = nums.length;
        int i = 0;
//        0-zero的元素都为0，zero+1到two-1的元素都为1，two到末尾的元素都为2
        while (i < two) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                int t = nums[i];
                nums[i] = nums[two];
                nums[two] = t;
            } else {
                zero++;
                int t = nums[i];
                nums[i] = nums[zero];
                nums[zero] = t;
                i++;
            }
        }

    }

}