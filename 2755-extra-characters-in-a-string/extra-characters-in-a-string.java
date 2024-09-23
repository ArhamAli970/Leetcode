class Solution {
    static int dp[];
    static int n;

public static int call(int i,String s,int dp[],HashSet<String> h){
   if(i>=n){return 0;}

   if(dp[i]!=-1){return dp[i];}

   int min=Integer.MAX_VALUE;
   for(String str:h){
       if(i+str.length()>n){continue;}
       String schk=s.substring(i,i+str.length());
       if(schk.equals(str)){
          int ans= call(i+str.length(),s,dp,h);
          min=Math.min(ans,min);
       }
   }

   min=Math.min(min,call(i+1,s,dp,h)+1);

   return dp[i]=min;   

}

    public int minExtraChar(String s, String[] dict){
        n=s.length();
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<dict.length;i++){h.add(dict[i]);} 
        dp=new int[n];
        Arrays.fill(dp,-1);

        return call(0,s,dp,h);
    }
}