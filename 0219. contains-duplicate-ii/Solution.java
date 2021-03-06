import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {99, 99};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(arr1, 2));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    //    这个题的思路也很难想到，要考虑索引之差小于k的情况
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}