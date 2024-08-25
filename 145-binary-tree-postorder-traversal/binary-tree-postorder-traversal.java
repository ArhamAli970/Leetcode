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


public static void  fun(TreeNode root,ArrayList <Integer> n){ 
if (root ==null){ 
    return;
}
fun(root.left,n);
fun(root.right,n);

n.add(root.val);
 
  

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList <Integer> n= new  ArrayList <Integer>();
        fun(root,n);
        return n;
    }
}