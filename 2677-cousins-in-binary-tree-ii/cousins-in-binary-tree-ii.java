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
    static class node{
        TreeNode root;
        int sm;
        node(TreeNode root,int sm){
            this.root=root;
            this.sm=sm;
        }

    }
    public TreeNode replaceValueInTree(TreeNode root) {
        
        int sum=root.val,nextSum=0;

        Queue<node> q=new LinkedList<>();
        q.add(new node(root,root.val));

        while(!q.isEmpty()){
            int size=q.size();
            nextSum=0;
            for(int i=0;i<size;i++){
                node curr=q.remove();
                curr.root.val=sum-curr.sm;
            int s1=0;
                if(curr.root.left!=null){
                    nextSum+=curr.root.left.val;
                    s1+=curr.root.left.val;
                }
                if(curr.root.right!=null){
                    nextSum+=curr.root.right.val;
                    s1+=curr.root.right.val;
                }

                 if(curr.root.left!=null){
                   q.add(new node(curr.root.left,s1));
                }
                if(curr.root.right!=null){
                    q.add(new node(curr.root.right,s1));
                }

            }
            sum=nextSum;
        }
        


        return root;

    }
}