class Solution {
    public int[] diStringMatch(String s) {
        int cd=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                cd++;
            }
        }
        
        if(s.charAt(0)=='I'){cd++;}
        int ci=cd+1;

        int ans[]=new int[s.length()+1];
        if(s.charAt(0)=='D'){ans[0]=ci++;}
        else{ans[0]=cd--;}
      

        for(int i=1;i<=s.length();i++){
            if(s.charAt(i-1)=='D'){
                ans[i]=cd--;
            }else{
                ans[i]=ci++;
                
            }
        }


return ans;
    }
}