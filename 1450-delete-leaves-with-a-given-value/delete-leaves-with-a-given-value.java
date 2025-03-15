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

    public static boolean call(TreeNode root,int target){
        if(root==null){return false;}

        boolean lft=call(root.left,target);
        boolean rht=call(root.right,target);

        if(lft){root.left=null;}
        if(rht){root.right=null;}

        return root.left==null && root.right==null && root.val==target; 

    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if(call(root,target)){return null;}

        return root;
        
    }
}