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
static int max;
public static int maxSum(TreeNode root){ 

    if(root==null){return 0;}

    int left=maxSum(root.left);
    int right=maxSum(root.right);

    int maxs=Math.max(left,right)+root.val;
    max=Math.max(max,maxs);
    max=Math.max(left+right+root.val,max);

    if(maxs<0){return 0;}

    return maxs;

     

}

    public int maxPathSum(TreeNode root) {
        max=-100000;
        maxSum(root);

        return max;

    }
}