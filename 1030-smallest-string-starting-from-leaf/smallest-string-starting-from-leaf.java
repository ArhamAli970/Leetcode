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
static String ans;

public static void call(TreeNode root,String s){
   if(root==null){return;}

   if(root.left==null && root.right==null){
        s=(char)(root.val+'a')+s;
        int val=s.compareTo(ans);
        if(val<0){ans=s;}
        return;
   }

   call(root.left,(char)(root.val+'a')+s);
   call(root.right,(char)(root.val+'a')+s);


}

    public String smallestFromLeaf(TreeNode root) {
        ans=""+(char)(28+'a');
        call(root,"");

        return ans;
        
    }
}