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
    public static int call(TreeNode root){
        if(root==null){return 0;}
        return Math.max(call(root.left),call(root.right))+1;
    }
    static TreeNode rt;
    public static boolean dfs(TreeNode root,int cnt){
        if(root==null){return cnt==0;}
        boolean lft=dfs(root.left,cnt-1);
        boolean rht=dfs(root.right,cnt-1);
        boolean a1=lft && rht;
        boolean a2=lft || rht;
        if(a1){rt=root;}
        if(a2){return true;}
        return false;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int m=call(root);
        dfs(root,m);
        return rt;

    }
}