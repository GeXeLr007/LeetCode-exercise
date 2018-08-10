public class Solution {

    public static void main(String[] args) {

//        int[] arr1 = {1, 5, 9, 1, 5, 9};
//        int[] arr2 = {3};
//        Solution solution = new Solution();
//        System.out.println(solution.containsNearbyAlmostDuplicate(arr1, 2, 3));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    这个题好玄学
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;

    }

}