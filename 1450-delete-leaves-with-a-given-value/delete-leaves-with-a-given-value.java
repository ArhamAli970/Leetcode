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
    if(root==null){return true;}
    if(root.left==null && root.right==null){
        return root.val==target?true:false;
    }

    boolean ans1=call(root.left,target)  ;
    boolean ans2=call(root.right,target);

    if(ans1 && ans2){
        root.left=null; root.right=null;
        return root.val==target?true:false;
    }

    if(ans1){root.left=null;}
    if(ans2){root.right=null;}

    return false;

}

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        

        return call(root,target) ?null : root;

        
    }
}