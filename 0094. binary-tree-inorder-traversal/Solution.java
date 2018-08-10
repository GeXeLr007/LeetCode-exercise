import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    
    public static void main(String[] args) {
        
    }


//    递归方式
//    private void inorder(TreeNode root,List<Integer> list){
//        if (root==null){
//            return;
//        }
//        
//        inorder(root.left,list);
//        list.add(root.val);
//        inorder(root.right,list);
//        
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node=root;
        while (node!=null || !stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node=node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node=node.right;
        }
        
        
        return list;

    }

}