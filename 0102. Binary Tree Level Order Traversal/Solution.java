import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        List<List<Integer>> lists = new Solution().levelOrder(node);
        return;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        List<List<Integer>> outlist = new ArrayList<>();
        if (root == null) {
            return outlist;
        }
        linkedList.push(root);
        while (!linkedList.isEmpty()) {
            ArrayList<Integer> tmplist = new ArrayList<>();
            outlist.add(tmplist);
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = linkedList.removeLast();
                tmplist.add(node.val);
                if (node.left != null) {
                    linkedList.push(node.left);
                }
                if (node.right != null) {
                    linkedList.push(node.right);
                }
            }

        }
        return outlist;
    }

}