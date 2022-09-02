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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(q.size() != 0)
        {
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++)
            {
                Node temp = q.poll();
                level.add(temp.val);
                for(Node child: temp.children)
                    q.offer(child);
            }
            ans.add(level);
        }
        return ans;
    }
}