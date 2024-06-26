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
    static int sum;
    public static void call(TreeNode root){
        if(root==null){return;}
        if(root.left!=null && root.left.right==null && root.left.left==null){sum+=root.left.val;}

        call(root.left);
        call(root.right);

    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        call(root);
        return sum;
        
    }
}