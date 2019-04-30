/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeetCode_Question145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty() && root!=null){
            TreeNode temp=stack.peek();
            if(temp.left == null && temp.right == null){
                TreeNode temp2=stack.pop();
                list.add(temp2.val);
            }
            else{
                
                if(temp.right!=null){
                    stack.push(temp.right);
                    temp.right=null;
                }
                
                 if(temp.left!=null){
                    stack.push(temp.left);
                    temp.left=null;
                }
                
            }
        }
        return list;
    }
}