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
    public int minDiffInBST(TreeNode root) {
        List<Integer> temp = new LinkedList<>();
        
        inorder(root, temp);
        
        int size = temp.size();
        int min = Integer.MAX_VALUE;
        for(int i =1; i<size; i++)
            min = Math.min(temp.get(i) - temp.get(i-1), min);
        return min;
    }
    
    public void inorder(TreeNode root, List<Integer> temp)
    {
        if(root == null)
            return;
        
        inorder(root.left, temp);
        temp.add(root.val);
        inorder(root.right, temp);
    }
}