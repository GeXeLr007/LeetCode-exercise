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

//    这是一种深度优先搜索，注意递归终止条件，需要保证是叶子节点，不仅要保证root==null
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }

}