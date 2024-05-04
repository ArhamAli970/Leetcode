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
    static ArrayList<TreeNode> ans;
    static HashMap<Integer,ArrayList<TreeNode>> mp;

    public static boolean isEqual(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){return true;}
        if( (root1==null && root2!=null ) || (root2==null && root1!=null) || (root1.val!=root2.val)){
            return false;
        }

        return isEqual(root1.left,root2.left) && isEqual(root1.right,root2.right);


    }

    public static int call(TreeNode root){

          if(root==null){return 0;}
    

          int cnt1=call(root.left);
          int cnt2=call(root.right);
          int max=Math.max(cnt1,cnt2);
            if(!mp.containsKey(max)){
                mp.put(max,new ArrayList<>());
            }

            ArrayList<TreeNode> chk=mp.get(max);

            // boolean fnd=false;
            int cnt=0;

            for(int i=0;i<chk.size();i++){
                if(isEqual(root,chk.get(i))){cnt++;}
            }


          if(cnt<=1){
            mp.get(max).add(root);
            if(cnt==1){ans.add(root);}
          }

          return max+1;

    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        mp=new HashMap<>();
        ans= new ArrayList<>();
        call(root);

        return new ArrayList<>(ans);
        
    }
}