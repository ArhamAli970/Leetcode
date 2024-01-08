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
        
//         int sum1=sum(root.left,low,  high);

//         int sum2=sum(root.right,low,  high);
    
        int val1=sum(root.left,low,  high)+sum(root.right,low,  high);
        
        return root.val>=low  && root.val<=high ? root.val+val1 :0 + val1;
        
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
       return  sum(root,low,high);
        
    }
}