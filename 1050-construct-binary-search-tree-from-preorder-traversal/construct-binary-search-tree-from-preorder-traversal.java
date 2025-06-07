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
    static int idx;
    public static TreeNode call(int pre[],int min,int max){
        if(idx>=pre.length || pre[idx]<min || pre[idx]>max){return null;}
        TreeNode root=new TreeNode(pre[idx++]);
        root.left=call(pre,min,root.val);
        root.right=call(pre,root.val,max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        idx=0;
        return call(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}