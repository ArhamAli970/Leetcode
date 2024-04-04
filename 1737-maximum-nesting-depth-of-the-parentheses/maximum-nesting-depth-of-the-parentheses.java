class Solution {
    public int maxDepth(String s) {

        int dpt=0,max=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){dpt++;
            max=Math.max(dpt,max);}
            else if(s.charAt(i)==')'){
                dpt--;
            }
        }

        return max;
        
    }
}