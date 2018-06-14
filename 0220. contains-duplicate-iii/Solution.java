import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 9, 1, 5, 9};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyAlmostDuplicate(arr1, 2, 3));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    用到了数学公式的变换
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.ceiling((long)nums[i] - (long)t) != null && set.ceiling((long)nums[i] - (long)t) <= (long)nums[i] + (long)t) {
                return true;
            } else {
                set.add((long)nums[i]);
            }
            if (set.size() == k + 1) {
                set.remove((long)nums[i - k]);
            }
        }
        return false;

    }

}