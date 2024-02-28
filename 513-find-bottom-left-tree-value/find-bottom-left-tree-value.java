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
   static int maxRow,ele;
    public static void call(TreeNode root,int row){
        if(root==null){return;}

        if(row>maxRow){
            maxRow=row;
            ele=root.val;
        }

        call(root.left,row+1);
        call(root.right,row+1);

    }
    public int findBottomLeftValue(TreeNode root) {

        maxRow=-1;ele=-1;

        call(root,0);
        return ele;
        
    }
}