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
    static HashSet<Integer> h;
    static  List<TreeNode> ans;

    public static TreeNode call(TreeNode root){
        if(root==null){return null;}

        TreeNode lft=call(root.left);
        TreeNode rht=call(root.right);

        if(h.contains(root.val)){

            if(lft!=null)ans.add(lft);
            if(rht!=null)ans.add(rht);

            return null;

        }
            
            TreeNode r1=new TreeNode(root.val);
            r1.left=lft;
            r1.right=rht;

            return r1;

    }


    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        h=new HashSet<>();
        ans=new ArrayList<>();

        for(int i:to_delete){
            h.add(i);
        }


        TreeNode a=call(root);
        if(a!=null){ans.add(a);}

        return ans;



    }
}