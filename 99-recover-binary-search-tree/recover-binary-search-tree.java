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
    static TreeNode n1,n2,prev;
    public static void call(TreeNode root){
          if(root==null){return;}
          call(root.left);
          if(prev!=null && root.val<prev.val){
              if(n1==null){
                n1=prev;
              }
                n2=root;
              
          }
          prev=root;
          call(root.right);
    }
    public void recoverTree(TreeNode root) {
        n1=null;n2=null;prev=null;
        call(root);

        int temp=n1.val;
        n1.val=n2.val;
        n2.val=temp;
    }
}