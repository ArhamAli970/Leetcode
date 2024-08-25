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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       

        List<List<Integer>> ans=new ArrayList<>();
         if(root==null){return ans;}

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int sz=q.size();
            ArrayList<Integer> arr=new ArrayList();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.remove();
                arr.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            ans.add(arr);

        }

        for(int i=1;i<ans.size();i+=2){
            int j=0,k=ans.get(i).size()-1;
            while(j<k){
                int ele=ans.get(i).get(j);
                ans.get(i).set(j,ans.get(i).get(k));
                ans.get(i).set(k,ele);
                j++;k--;
            }
        }


        return ans;


        
    }
}