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
    static int max;
    public static int call(TreeNode root){
        if(root==null){return 0;}

        int left=call(root.left);
        int right=call(root.right);

        max=Math.max(max,left+right);

        return Math.max(left,right)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        call(root); 
        return max;
    }
}