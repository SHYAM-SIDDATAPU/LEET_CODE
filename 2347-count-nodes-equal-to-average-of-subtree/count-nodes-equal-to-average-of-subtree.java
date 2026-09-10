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
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t.val==sum(t,0)/count(t,0)) c++;
            System.out.println(count(t,0));
            if(t.left!=null) q.offer(t.left);
            if(t.right!=null) q.offer(t.right);
        }
        return c;
    }
    int sum(TreeNode t,int s){
        if(t==null) return 0;
        return t.val+sum(t.left,s)+sum(t.right,s);
    }
    int count(TreeNode t,int s){
        if(t==null) return 0;
        return 1+count(t.left,s)+count(t.right,s);
    }
}