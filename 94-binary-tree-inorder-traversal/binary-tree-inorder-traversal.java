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
static List<Integer> inOrder;

public static void fun(TreeNode root){ 
if (root==null){ 
    return;
}
fun( root.left);
inOrder.add(root.val);
fun( root.right);
}

    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder= new ArrayList<>();
        fun(root); 
        return inOrder;


    }
}