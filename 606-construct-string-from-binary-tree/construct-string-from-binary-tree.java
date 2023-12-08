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
  static StringBuilder sb;

  public static void call(TreeNode root,int i){ 
    // if(root.right==null && root.left==null){
    //   return;}
   

if(i!=0){
     sb.append("(");
     sb.append(String.valueOf(root.val));
}

if(root.left!=null && root.right!=null){
call(root.left,i+1);
call(root.right,i+1);
}

else if(root.left!=null || root.right!=null){
    if(root.left==null && root.right!=null){
       sb.append("()");
       call(root.right,i+1);
       }
     else if(root.left!=null && root.right==null){
       call(root.left,i+1);
     }
}
  

if(i!=0){
     sb.append(")");
}



  }
    public String tree2str(TreeNode root) {
        sb=new StringBuilder();
        sb.append(String.valueOf(root.val));
        call(root,0);


return sb.toString();


    }
}