/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeetCode_Question94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while(temp!=null || !stack.isEmpty()){
            while(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            temp=stack.pop();
            l.add(temp.val);
            temp=temp.right;
        }
        
        return l;
    }
}