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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==q && p==null) return true;
        if((p==null ||q==null)|| p.val!=q.val) return false;
        Queue<TreeNode> q1= new LinkedList<>();
        q1.offer(p);
        Queue<TreeNode> q2= new LinkedList<>();
        q2.offer(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            int n1=q1.size();
            int n2=q2.size();
            for(int i=0;i<n1 &&i<n2;i++){
            TreeNode t1= q1.poll();
            TreeNode t2= q2.poll();
            if(t1.val!=t2.val) return false;

            if(t1.left==null && t2.left!=null) return false;
            if(t1.left!=null && t2.left==null) return false;

            if(t1.right!=null && t2.right==null) return false;
            if(t1.right==null && t2.right!=null) return false;

            if(t1.left!=null) q1.offer(t1.left);
            if(t1.right!=null) q1.offer(t1.right);

            if(t2.left!=null) q2.offer(t2.left);
            if(t2.right!=null) q2.offer(t2.right);
            
            }
        
        }
        return true;

    }
}