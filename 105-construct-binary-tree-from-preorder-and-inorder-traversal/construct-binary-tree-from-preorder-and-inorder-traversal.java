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
    static int n;
    static int idx;
    public static TreeNode call(int pre[],int in[],int st,int end){
        if(st>end){return null;}
        int curr=-1;
        for(int i=st;i<=end;i++){
            if(in[i]==pre[idx]){
                curr=i;break;
            }
        }
        idx++;
        TreeNode root=new TreeNode(in[curr]);
        root.left=call(pre,in,st,curr-1);
        root.right=call(pre,in,curr+1,end);

        return root;


    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        n=preorder.length;
        idx=0;
        return call(preorder,inorder,0,n-1);
    }
}