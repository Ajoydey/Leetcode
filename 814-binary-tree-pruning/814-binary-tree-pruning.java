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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return null;
        
        if(root.val == 1)
        {
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
        }
        else
        {
            TreeNode temp1 = pruneTree(root.left);
            TreeNode temp2 = pruneTree(root.right);
            if(temp1 == null && temp2 == null)
                return null;
            
            root.left = temp1;
            root.right = temp2;
        }
        return root;
    }
}