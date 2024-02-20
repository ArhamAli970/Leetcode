class Solution {
    public boolean wordBreak(String s, List<String> B) {
            int m=s.length();
            int n=B.size(),max=0;
         HashSet<String> h= new HashSet<>();
         for(String i:B){
             h.add(i);
             max=Math.max(max,i.length());
         }
     
     boolean dp[]=new boolean[m+1];
     dp[0]=true;
     
     for(int i=0;i<m;i++){
         String ans="";
        for(int j=i;j>=Math.max(0,i-20);j--){
            ans=s.charAt(j)+ans;
            if(h.contains(ans) && dp[j]){dp[i+1]=true;break;}
        }
     
    }
    
         return dp[m];
    }
}