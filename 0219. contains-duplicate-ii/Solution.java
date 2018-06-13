import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {99,99};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(arr1, 2));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j <= i + k; j++) {
                if (!set.contains(nums[j])) {
                    set.add(nums[j]);
                } else {
                    return true;
                }
            }
        }
        return false;

    }

}