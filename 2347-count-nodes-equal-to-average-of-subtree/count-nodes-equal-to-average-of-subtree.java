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
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        avgc(root);
        return c;
    }
    int[] avgc(TreeNode root){
        if(root==null) return new int []{0,0};
        int [] l= avgc(root.left);
        int [] r= avgc(root.right);
        int s=root.val+l[0]+r[0];
        int c1=1+l[1]+r[1];
        if(s/c1==root.val) c++;
        return new int[]{s,c1};
    }
}