import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preTraversal(list, root);
        return list;
    }

    private void preTraversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preTraversal(list, root.left);
        preTraversal(list, root.right);
    }

}