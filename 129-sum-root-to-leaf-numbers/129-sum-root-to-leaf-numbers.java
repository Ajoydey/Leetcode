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
    public int sumNumbers(TreeNode root) {
        
        return solve(root, 0);
    }
    
    public int solve(TreeNode root, int num)
    {
        if(root.left == null && root.right == null)
            return num*10 +root.val;
        
        int leftsum = 0, rightsum = 0;
        if(root.left != null)
            leftsum = solve(root.left, num*10+root.val);
        if(root.right != null)
            rightsum = solve(root.right, num*10+root.val);
        
        return leftsum + rightsum;
        
        
    }
}