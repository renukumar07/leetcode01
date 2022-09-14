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
    int count = 0;
    private void preorder(TreeNode node, Set<Integer> set){
        if(node==null){
            return;
        }
        if(set.contains(node.val)){
            set.remove(node.val);
        }else{
            set.add(node.val);
        }
        if(node.left == null && node.right == null){
            if(set.size()<=1){
                count++;
            }
        }
        preorder(node.left, new HashSet<>(set));
        preorder(node.right, new HashSet<>(set));
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        preorder(root, new HashSet<>());
        return count;
    }
}