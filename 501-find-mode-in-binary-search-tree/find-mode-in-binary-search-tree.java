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

    static HashMap<Integer,Integer> mp;
    static int max;

     public static void call(TreeNode root){ 
        if(root==null){return;}
         
        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        max=Math.max(max,mp.get(root.val));

        call(root.left);
        call(root.right);



     }

    public int[] findMode(TreeNode root) {
   
   mp = new HashMap<>();
   max=0;

   call(root);
   int cnt=0;
   for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
       if(e.getValue()==max){ 
           cnt++;
       }
   }

int arr[]= new int[cnt];
cnt=0;
  for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
       if(e.getValue()==max){ 
           arr[cnt++]=e.getKey();
       }
   }

   return arr;
        
    }
}