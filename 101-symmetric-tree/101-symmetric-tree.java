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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return solve(root.left, root.right);
    }
    public boolean solve(TreeNode leftChild, TreeNode rightChild)
    {
        if(leftChild == null && rightChild == null)
            return true;
        if(leftChild == null || rightChild == null || (leftChild.val != rightChild.val))
            return false;
        
        return solve(leftChild.right, rightChild.left) && solve(leftChild.left, rightChild.right);
    }
}