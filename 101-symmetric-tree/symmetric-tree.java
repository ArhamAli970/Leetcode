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
    static ArrayList<Integer> a1;
    static ArrayList<Integer> a2;

public static void call(TreeNode root){
    if(root==null){a1.add(-1); return;}

     a1.add(root.val);
    call(root.left); 
    call(root.right);

}


public static void call1(TreeNode root){
    if(root==null){a2.add(-1); return;}

     a2.add(root.val);
     call1(root.right);
    call1(root.left); 
    

}

    public boolean isSymmetric(TreeNode root) {
        a1=new ArrayList<>();
        a2=new ArrayList<>();
        call(root);
        call1(root);

        if(a1.size()!=a2.size()){return false;}

int i=0;
        while(i<a1.size()){
            if(a1.get(i)!=a2.get(i))return false;
            i++;
        }

        return true;

        




        
    }
}