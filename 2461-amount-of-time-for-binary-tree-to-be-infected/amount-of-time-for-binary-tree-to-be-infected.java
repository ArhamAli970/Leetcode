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
    static Stack<TreeNode> anc;
    static int time;

    public static void timeAmt(TreeNode root){ 
        HashSet<Integer> h= new HashSet<>();
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            
            for(int j=0;j<size;j++){ 

                TreeNode curr=q.remove();
                h.add(curr.val);
               



                if(curr.left!=null && !h.contains(curr.left.val)){
                    q.add(curr.left);
                }

                if(curr.right!=null && !h.contains(curr.right.val)){
                    q.add(curr.right);
                }



            }
             if(!anc.isEmpty()){
                    q.add(anc.pop());
            }
            time++;
        }
    }

    public static int call(TreeNode root,int start){
        if(root==null){return 0;}

        if(root.val==start){
            timeAmt(root);
            return -1;
        }

        anc.push(root);

        int ret1=call(root.left,start);
        int ret2=call(root.right,start);

        if(ret1==-1 || ret2==-1){return -1;}

        anc.pop();
        return 0;
    }


    public int amountOfTime(TreeNode root, int start) {

        anc= new Stack<>();
        time=0;

        call(root,start);

        return time-1;

        
    }
}