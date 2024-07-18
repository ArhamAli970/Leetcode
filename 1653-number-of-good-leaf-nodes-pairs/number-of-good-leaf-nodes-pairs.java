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
    static int cnt;
    public static ArrayList<Integer> call(TreeNode root,int dist){
        if(root==null){return new ArrayList<>();}
        if(root.left==null && root.right==null){
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(1);return ans;
        }
        
        ArrayList<Integer> arr1=call(root.left,dist);
        ArrayList<Integer> arr2=call(root.right,dist);

        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                  if(arr1.get(i)+arr2.get(j)<=dist){cnt++;}
            }
        }

        arr1.addAll(arr2);

        for(int i=0;i<arr1.size();i++){
            arr1.set(i,arr1.get(i)+1);
        }


        return arr1;




    }

    public int countPairs(TreeNode root, int distance) {
        cnt=0;
        call(root,distance);
        return cnt;
        
    }
}