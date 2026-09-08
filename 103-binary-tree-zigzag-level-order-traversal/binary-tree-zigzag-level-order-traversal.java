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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> l= new ArrayList<>();
      if(root==null) return l; 
      Deque<TreeNode> q= new LinkedList<>();
      q.offer(root);
      int c=0;
      while(!q.isEmpty()){
         int n=q.size();
         List<Integer> l1= new ArrayList<>();
        for(int i=0;i<n;i++){
            TreeNode t= q.poll();
            l1.add(t.val);
            if(t.left!=null) q.offer(t.left);
            if(t.right!=null) q.offer(t.right);
        }
        if(c%2!=0) Collections.reverse(l1);
         
         c++;
         l.add(l1);
      }
      return l;
    }
}