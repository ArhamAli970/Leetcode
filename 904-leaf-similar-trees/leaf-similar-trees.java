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

    

static void call(TreeNode root,ArrayList<Integer> a){ 
    if(root==null){return;}
    if(root.left==null && root.right==null){
        a.add(root.val);
        return;
    }
    

    call(root.left,a);
    call(root.right,a);


}

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2= new ArrayList<>();
        call(root1,a1);
        call(root2,a2);

        if(a1.size()!=a2.size()){return false;}

        int i=0;
        while(i<a1.size()){
            if(a1.get(i)!=a2.get(i)){return false;}
            i++;
        }
        return true;

    }
}