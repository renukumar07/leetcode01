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
    private void path(TreeNode root, int targetSum, List<List<Integer>> list, List<Integer> p){
        if(root==null){
            return;
        }
        p.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null){
            list.add(new ArrayList<>(p));
        }else{
            path(root.left, targetSum-root.val,list, p);    
            path(root.right, targetSum-root.val,list, p);
        }
        p.remove(p.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        path(root, targetSum, list, new ArrayList<>());
        return list;
    }
}