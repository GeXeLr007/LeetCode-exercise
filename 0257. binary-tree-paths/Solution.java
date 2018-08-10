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

//    递归思想
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> strings = new ArrayList<>();
        if (root == null) {
            return strings;
        }
        if (root.left == null && root.right == null) {
            strings.add(String.valueOf(root.val));
        }
        List<String> lefts = binaryTreePaths(root.left);
        for (int i = 0; i < lefts.size(); i++) {
            strings.add(String.valueOf(root.val) + "->" + lefts.get(i));
        }

        List<String> rights = binaryTreePaths(root.right);
        for (int i = 0; i < rights.size(); i++) {
            strings.add(String.valueOf(root.val) + "->" + rights.get(i));
        }
        return strings;

    }
}