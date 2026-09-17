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
    int m=-1001;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return m;
    }
    int dfs(TreeNode t){
        if(t==null) return 0;
        int l= dfs(t.left);
        int r=dfs(t.right);
        m=Math.max(m,t.val+Math.max(0,l)+Math.max(0,r));
        return t.val+Math.max(0,Math.max(l,r));
    }
}