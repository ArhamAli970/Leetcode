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
    
    public static int sum(TreeNode root, int low, int high){ 
    
        if(root==null){return 0;}

int sum1=0;
    
    if(root.val>=low){
        sum1+=sum(root.left,low,  high);
    }
    if(root.val<=high){
        sum1+=sum(root.right,low,  high);
    }
        
        return root.val>=low  && root.val<=high ? root.val+sum1 :0 + sum1;
        
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
       return  sum(root,low,high);
        
    }
}