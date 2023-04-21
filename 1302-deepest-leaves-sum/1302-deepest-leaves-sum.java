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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ans = 0;
            for(int i = 0;i<size;i++){
                TreeNode treeNode = queue.poll();
                ans += treeNode.val;
                if(treeNode.left!=null)
                    queue.offer(treeNode.left);
                if(treeNode.right!=null)
                    queue.offer(treeNode.right);
            }
        }
        return ans;
    }
}