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
    static int sum;
    public static void call(TreeNode root,int currSum){
        if(root==null){return;}
        if(root.left==null && root.right==null){
            sum+=currSum*10+root.val;
            return;
        }

        call(root.left,currSum*10+root.val);
        call(root.right,currSum*10+root.val);



    }
    public int sumNumbers(TreeNode root) {

        sum=0;
        call(root,0);

        return sum;
        
    }
}