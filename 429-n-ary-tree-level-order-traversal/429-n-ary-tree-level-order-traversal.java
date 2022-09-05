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
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            List<Integer> currentLevel = new ArrayList<>();
            int len = q.size();
            for(int i = 0; i<len;i++){
                Node node = q.poll();
                currentLevel.add(node.val);
                for(Node n: node.children){
                    q.offer(n);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}