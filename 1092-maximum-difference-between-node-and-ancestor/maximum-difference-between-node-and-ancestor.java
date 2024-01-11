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

    static int maxDiff;
    public static void call(TreeNode root,int max,int min){ 
    if(root==null){ 
       return;
    }
        int m1=Math.abs(root.val-max);
        int m2=Math.abs(root.val-min);
        maxDiff=Math.max(maxDiff,Math.max(m1,m2));

        call(root.left,Math.max(root.val,max),Math.min(root.val,min));
        call(root.right,Math.max(root.val,max),Math.min(root.val,min));

    

        
        
    }
    public int maxAncestorDiff(TreeNode root) {
     maxDiff=0;
    call(root,root.val,root.val);
        
    return maxDiff;
        
    }
}