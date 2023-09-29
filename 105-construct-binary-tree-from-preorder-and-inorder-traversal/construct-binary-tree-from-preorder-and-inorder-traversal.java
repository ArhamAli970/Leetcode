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
    public static TreeNode call(int st,int end,int pre[],int in[]){ 
       
       if(st>end){return null;}
       if(st==end){return new TreeNode(pre[idx++]);}

       TreeNode curr=new TreeNode(pre[idx]);
       
       int mid=0;

       for(int i=st;i<=end;i++){ 
          if(in[i]==pre[idx]){mid=i; break;}
       }

       idx++;

       curr.left=call(st,mid-1,pre,in);
       curr.right=call(mid+1,end,pre,in);

       return curr;
       


    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx=0;
        return call(0,preorder.length-1,preorder,inorder);

    }
}