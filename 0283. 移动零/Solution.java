import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2,0,0,0, 3, 4, 5};
        Solution solution = new Solution();
        
//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    双指针，前一个指针指向需要覆盖的下标，后一个指针遍历所有下标
    public void moveZeroes(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i]=0;
        }
    }

   

}