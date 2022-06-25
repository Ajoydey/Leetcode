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
    
    public int rob(TreeNode root) {
        Map<TreeNode, Integer> dp = new HashMap<>();
        return solve(root, dp);
    }
    public int solve(TreeNode node, Map<TreeNode, Integer> dp)
    {
        if(node == null)
            return 0;
        if(dp.containsKey(node))
            return dp.get(node);
        
        int ans1 = node.val;
        int ans2 = solve(node.left, dp) + solve(node.right, dp);
        if(node.left != null)
            ans1 = ans1 + solve(node.left.left, dp) + solve(node.left.right, dp);
        if(node.right != null)
            ans1 = ans1 + solve(node.right.left, dp) + solve(node.right.right, dp);
        
        dp.put(node, Math.max(ans1, ans2));
        return dp.get(node);
    }
}