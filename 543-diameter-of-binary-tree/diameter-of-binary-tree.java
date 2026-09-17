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
    int m=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return m-1;
    }
    int dfs(TreeNode t){
        if(t==null)
          return 0;
          int l=dfs(t.left);
          int r=dfs(t.right);
          m=Math.max(m,1+l+r);
          return 1+Math.max(l,r);
    }
}