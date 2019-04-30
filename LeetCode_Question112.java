/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeetCode_Question112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) 
            return false; 
        else 
        { 
            boolean ans = false; 
   
            /* otherwise check both subtrees */
            int subsum = sum - root.val; 
            if (subsum == 0 && root.left == null && root.right == null) 
                return true; 
            if (root.left != null) 
                ans = ans || hasPathSum(root.left, subsum); 
            if (root.right != null) 
                ans = ans || hasPathSum(root.right, subsum); 
            return ans; 
        } 
    }
}