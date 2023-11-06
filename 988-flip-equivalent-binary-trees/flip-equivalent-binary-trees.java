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
    
    public static boolean call(TreeNode root1, TreeNode root2){ 
         if(root1==null && root2==null ){return true;}

         if((root1==null && root2!=null) || (root2==null && root1!=null) || (root1.val!=root2.val)){return false;}


        //  if(root1.left==null && root2.left==null && root1.right==null && root2.right==null){return true;}



        if(root1.left!=null || root2.left!=null){
         if((root1.left==null && root2.left!=null) || (root1.left!=null && root2.left==null) ||  (root1.left.val !=root2.left.val)){
             TreeNode v= root1.left;
             root1.left=root1.right;
             root1.right=v;
         }}
        
        return call(root1.left,root2.left) && call(root1.right,root2.right);
        
        
        
    }
    
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
    
        
        return call(root1,root2);
        
        
    }
}