class Solution {
    static int dp[][];
    public static int call(int i,int lastIdx,String s,int k){
        if(i==s.length()){return 0;}
        int diff=lastIdx==-1?-1:s.charAt(i)-s.charAt(lastIdx);

        if(lastIdx!=-1 && dp[i][diff+26]!=-1){return dp[i][diff+26];}

        int take=-1,notTake=-1;

        if(lastIdx==-1  || Math.abs(diff)<=k){
            take=call(i+1,i,s,k)+1;
        }
        notTake=call(i+1,lastIdx,s,k);

        if(lastIdx==-1){return Math.max(notTake,take);}

        dp[i][diff+26]=Math.max(take,notTake);

        return dp[i][diff+26];
        
         
        

    }
    public int longestIdealString(String s, int k) {
        int n=s.length();
        dp= new int[n+1][53];

        for(int i[]:dp){
            Arrays.fill(i,-1);
        }

        return call(0,-1,s,k);
    }
}