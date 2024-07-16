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
static StringBuilder ans;
    public static StringBuilder call(TreeNode root,int st,int end,int pos){
        if(root==null){return new StringBuilder();}

        StringBuilder s1=call(root.left,st,end,-1);
        StringBuilder s2=call(root.right,st,end,1);

    
        if(root.val==st){
            if(s1.length()!=0 || s2.length()!=0){
                ans=s1.length()==0?s2:s1;
                if(ans.charAt(0)!='U'){ans.reverse();}
                return s1.length()==0?s1:s2;
            }else{
                s1.append('U');
            }

        }
        else if(root.val==end){
            if(s1.length()!=0 || s2.length()!=0){
                ans=s1.length()==0?s2:s1;
                if(ans.charAt(0)!='U'){ans.reverse();}
                return s1.length()==0?s1:s2;
            }else{
                char ch=pos==-1?'L':'R';
                s1.append(ch);
            }
        }
        else{
            if(s1.length()!=0 && s2.length()!=0){
                if(s1.charAt(0)=='U'){
                    s2.reverse();
                    ans=s1.append(s2);
                }else{
                    s1.reverse();
                    ans=s2.append(s1);
                }
                return new StringBuilder();
            }
            if(s1.length()!=0){
                char ch=s1.charAt(0)=='U'?'U':(pos==-1?'L':'R');
                s1.append(ch);
            }
            else if(s2.length()!=0){
                char ch=s2.charAt(0)=='U'?'U':(pos==-1?'L':'R');
                s2.append(ch);
                return s2;
            }
        }

        return s1;

    }

    public String getDirections(TreeNode root, int startValue, int destValue) {

        call(root,startValue,destValue,0);
        return ans.toString();
        
    }
}