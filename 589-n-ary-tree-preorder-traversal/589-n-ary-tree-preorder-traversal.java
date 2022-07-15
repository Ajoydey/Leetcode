/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> ans = new ArrayList<>();
        preorder_(root, ans);
        return ans;
    }
    public void preorder_(Node root, List<Integer> ans)
    {
        if(root == null)
            return;
        
        ans.add(root.val);
        
        List <Node> temp = new ArrayList<>();
        
        temp = root.children;
        
        for(int i =0; i<temp.size(); i++)
        {
            preorder_(temp.get(i), ans);
        }
        
    }
}