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
    List<Integer> nodesList = new ArrayList<>();
    int minDistance = Integer.MAX_VALUE;
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        nodesList.add(root.val);
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        for(int i = 1;i<nodesList.size();i++){
            minDistance = Math.min(minDistance, nodesList.get(i)-nodesList.get(i-1));
        }
        return minDistance;
    }
}