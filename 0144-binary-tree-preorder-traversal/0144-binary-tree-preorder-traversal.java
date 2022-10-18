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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
    dfs(root, ret);
    return ret;
}

private void dfs(TreeNode root, List<Integer> ret) {
    if (root != null) {
        ret.add(root.val);
        dfs(root.left, ret);
        dfs(root.right, ret);
    }
        
    }
}