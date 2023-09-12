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
    static  ArrayList<Long> l; 
    static int mod=1000000007;
    public static long call(TreeNode root){ 
        if(root==null){return 0;}
        
        long val1=call(root.left);
        long val2=call(root.right);
        
        long sum=(val1+val2+root.val)%mod;
        l.add(sum);
        
        return sum;
    
    }
    public int maxProduct(TreeNode root) {
        
        l= new ArrayList<>();
        long tot=call(root);
    
        long max=0;
        for(int i=0;i<l.size();i++){ 
           long prod= l.get(i) * (tot-l.get(i)); 
           max=Math.max(max,prod);
        }
        return (int)(max%mod);
    }
}