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
    public boolean find(TreeNode root, int target, Set<Integer> set){
        if(root == null){
            return false;
        }
        if(set.contains(root.val)){
            return true;
        }
        set.add(target-root.val);
        return find(root.left, target, set) || find(root.right, target, set);
    }
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }
}