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
    static int arr[];
    static int cnt;
    public static void call(TreeNode root){
        if(root==null){return;}
        if(root.left==null && root.right==null){
            ++arr[root.val];
            int cntOdd=0;
            for(int i:arr){
                if(i%2!=0){
                    cntOdd++;
                }
            }
            if(cntOdd<2){cnt++;}
            --arr[root.val];
            return;}
        ++arr[root.val];
        call(root.left);
        call(root.right);
        --arr[root.val];
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        arr= new int[10];
        cnt=0;
        call(root);
        return cnt;

    }
}