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

        call(root,0);

sb.insert(0,String.valueOf(root.val));
// System.out.print(sb);
// int j=0,n=sb.length();

// char ans[]=sb.toString().toCharArray();

// for(int i=0;i<n-2;i++){ 

// if((ans[i]=='(' && ans[i+1]==')' && ans[i+2]==')') || (ans[i]=='(' && ans[i+1]==')' && i+2==n)){ 
//   ans[i]='X';ans[i+1]='X';
// }

// }

// sb=new StringBuilder();
// for(int i=0;i<n;i++){ 
//   if(ans[i]!='X'){sb.append(ans[i]);}
// }

return sb.toString();


    }
}