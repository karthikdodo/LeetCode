/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeetCode_Question235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parent=root.val;
        int pval=p.val;
        int qval=q.val;
        if(pval>parent&&qval>parent){
            return lowestCommonAncestor(root.right, p, q);
        }
        else if(pval<parent&&qval<parent){
            return lowestCommonAncestor(root.left, p, q);
        }
        else{
            return root;
        }
        
    }
}