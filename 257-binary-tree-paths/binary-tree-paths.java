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
    List<String> l= new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return l;
        fun(root);
        return l;
    }
    StringBuilder s= new StringBuilder();
    void fun(TreeNode t){
        if(t==null) {
            return ;
        }
        int n=s.length();
        s.append(String.valueOf(t.val));
        if(t.left==null && t.right==null){
            l.add(s.toString());
        } 
        else{
            s.append("->");
        }
        fun(t.left);
        fun(t.right);
        s.setLength(n);
    }
}