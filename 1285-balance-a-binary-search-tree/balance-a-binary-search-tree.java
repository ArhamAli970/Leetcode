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
    static ArrayList<Integer> arr;
    public static void getIdx(TreeNode root){
        if(root==null)return;

        
        getIdx(root.left);
        arr.add(root.val);
        getIdx(root.right);

    }

    public static TreeNode blcTree(int st,int end){
        if(st>end){return null;}
        if(st==end)return new TreeNode(arr.get(st));
       int mid=(st+end)/2;
       TreeNode nd= new TreeNode(arr.get(mid));

       nd.left=blcTree(st,mid-1);
       nd.right=blcTree(mid+1,end);

return nd;

    }

    public TreeNode balanceBST(TreeNode root) {
        arr=new ArrayList<>();
        getIdx(root);
        return blcTree(0,arr.size()-1);

    }
}