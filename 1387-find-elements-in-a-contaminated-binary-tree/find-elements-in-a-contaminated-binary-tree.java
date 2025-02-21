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
class FindElements {
    static HashSet<Integer> h;
    public static void call(TreeNode root,int val){
        if(root==null){return;}
        h.add(val);
        call(root.left,val*2+1);
        call(root.right,val*2+2);
    } 
    public FindElements(TreeNode root) {
        h=new HashSet<>();
        call(root,0);
    }
    
    public boolean find(int target) {
        return h.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */