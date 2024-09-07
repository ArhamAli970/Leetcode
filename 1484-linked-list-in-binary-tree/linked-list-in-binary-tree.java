/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

    public static boolean dfsMore(TreeNode root,ListNode curr){
        if(curr==null){return true;}
        if(root==null || curr.val!=root.val){return false;}
        curr=curr.next;
        return dfsMore(root.left,curr)  || dfsMore(root.right,curr);
    }

    public static boolean dfs(ListNode head,TreeNode root){
        ListNode curr=head;
        return dfsMore(root,curr);
    }

    

    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null){return false;}

        if(head.val==root.val && dfs(head,root)){
            return true;
        }

        return isSubPath(head,root.left) || isSubPath(head,root.right);
    }
}