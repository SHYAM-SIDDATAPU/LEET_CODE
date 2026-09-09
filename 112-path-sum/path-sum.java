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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Queue<Integer> st= new LinkedList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        st.offer(root.val);
        while(!q.isEmpty()){
            TreeNode t= q.poll();
            int s=st.poll();
            if(t.left==null && t.right==null && s==targetSum) return true;

            if(t.left!=null){
                q.offer(t.left);
                st.offer(s+t.left.val);
            }
            if(t.right!=null){
                q.offer(t.right);
                st.offer(s+t.right.val);
            }
        }
        return false;
    }
}