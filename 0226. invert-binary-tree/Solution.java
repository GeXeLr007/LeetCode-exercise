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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        return root;

    }

}