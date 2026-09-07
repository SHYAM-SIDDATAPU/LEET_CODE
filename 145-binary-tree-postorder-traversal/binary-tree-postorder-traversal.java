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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l= new ArrayList<>();
        if(root==null) return l;
        Stack<TreeNode> st1= new Stack<>();
        Stack<TreeNode> st2= new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode t=st1.pop();
            st2.push(t);
            if(t.left!=null) st1.push(t.left);
            if(t.right!=null) st1.push(t.right);
        }
        while(!st2.isEmpty()){
            l.add(st2.pop().val);
        }
        return l;
    }
}