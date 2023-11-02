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
    static int c;
    static class node{ 
        int sum,cnt;
        node(int sum,int cnt){ 
            this.sum=sum;this.cnt=cnt;
        }
    }

public static node call(TreeNode root){ 
    if(root==null){ 
        return new node(0,0);
    }

node left=call(root.left);
node right=call(root.right);

int sum=left.sum+right.sum+root.val;
int cnt= left.cnt+right.cnt+1;

if(sum/cnt==root.val){c++;}

return new node(sum,cnt);

}

    public int averageOfSubtree(TreeNode root) {

        c=0;
        call(root);

        return c;

    }
}