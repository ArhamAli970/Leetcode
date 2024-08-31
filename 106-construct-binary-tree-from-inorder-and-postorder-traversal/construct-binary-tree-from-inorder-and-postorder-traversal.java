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
    static int n,idx;
    public static TreeNode call(int st,int end,int in[],int pst[]){
        if(st>end){return null;}
        int curr=-1;
        for(int i=st;i<=end;i++){
            if(in[i]==pst[idx]){
                curr=i;break;
            }
        }
        idx--;
        TreeNode root=new TreeNode(in[curr]);
        root.right=call(curr+1,end,in,pst);
        root.left=call(st,curr-1,in,pst);


        return root;



    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        n=inorder.length;
        idx=n-1;
        return call(0,n-1,inorder,postorder);
    }
}