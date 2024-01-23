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
    static int cnt;
    public static int call(TreeNode root){
        if(root==null){return 0;}

        int rht=call(root.right);
        int lft=call(root.left);

        if(rht==-1 || lft==-1){ cnt++; return 1;}

        if(lft==1 || rht==1){return 0;}
       
        return -1;
    }
    public int minCameraCover(TreeNode root) {
        cnt=0;
        if(root.left==null && root.right==null){return 1;}
        if(call(root)==-1){cnt++;}
        return cnt;
    }
}