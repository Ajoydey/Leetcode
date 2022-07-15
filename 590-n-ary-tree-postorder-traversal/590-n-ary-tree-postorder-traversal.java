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
    public List<Integer> postorder(Node root) {
    List<Integer> ans = new ArrayList<>();
        postorder_(root, ans);
        return ans;
    }
    public void postorder_(Node root, List<Integer> ans)
    {
        if(root == null)
            return;
        
        List <Node> temp = new ArrayList<>();
        
        temp = root.children;
        
        for(int i =0; i<temp.size(); i++)
        {
            postorder_(temp.get(i), ans);
        }
        ans.add(root.val);
        
    }
        
}