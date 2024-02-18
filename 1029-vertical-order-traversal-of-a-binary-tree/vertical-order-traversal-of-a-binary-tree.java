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
   static TreeMap<Integer,TreeMap<Integer,List<Integer>>> mp;
public static void call(int r,int c, TreeNode root){
    if(root==null){
        return;
    }

    call(r+1,c-1,root.left);
    call(r+1,c+1,root.right);

    if(!mp.containsKey(c)){
        mp.put(c,new TreeMap<>());
    }

    if(! mp.get(c).containsKey(r)){
        mp.get(c).put(r,new ArrayList<>());
    }

    mp.get(c).get(r).add(root.val);


}

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        mp= new TreeMap<>();

        call(0,0,root);

        for(Map.Entry<Integer,TreeMap<Integer,List<Integer>>> e: mp.entrySet()){
            TreeMap<Integer,List<Integer>> a= e.getValue();
            List<Integer> con= new ArrayList<>();
            for(Map.Entry<Integer,List<Integer>> newAr: a.entrySet()){
                 List<Integer> a1= newAr.getValue();
                 Collections.sort(a1);
                 for(int i:a1){con.add(i);}
            }
            ans.add(con);
        }

return ans;
    }
}