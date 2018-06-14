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

    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
//        当前节点的深度为左右子树最大深度+1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

}