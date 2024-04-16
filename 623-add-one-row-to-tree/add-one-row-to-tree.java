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

public static void call(TreeNode root,int d,int v){
    if(root==null){return;}

    if(d-1==0){
        TreeNode r1=root.left;
        TreeNode r2=root.right;
        root.left=new TreeNode(v);
        root.left.left=r1;
        root.right=new TreeNode(v);
        root.right.right=r2;
        return;
    }

    call(root.left,d-1,v);
    call(root.right,d-1,v);

}

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1){
            TreeNode r= new TreeNode(val);
            r.left=root;
            return r;
        }

        call(root,depth-1,val);
        return root;
        
    }
}