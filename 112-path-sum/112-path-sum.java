/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum);
    }
    
    public boolean solve(TreeNode root, int targetSum)
    {
        if(root == null) //base condition
            return false;
        if(root.left == null && root.right == null) //chack for leaf nodes
            return (targetSum-root.val == 0);
        
        boolean leftSum =false, rightSum =false;
        if(root.left != null)
            leftSum = solve(root.left, targetSum-root.val);
        if(root.right != null)
            rightSum = solve(root.right, targetSum-root.val);
        
        return leftSum || rightSum;
    }
}