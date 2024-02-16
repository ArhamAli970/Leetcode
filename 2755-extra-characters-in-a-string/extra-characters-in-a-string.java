class Solution {
    public int minExtraChar(String s, String[] dix) {
        HashSet<String>h= new HashSet<>();
        for(String i:dix){h.add(i);}
        int n=s.length();
        int dp[]= new int[n+1];

        for(int i=0;i<n;i++){
            int ans=dp[i]+1;
            for(int j=i;j>=0;j--){

                if(h.contains(s.substring(j,i+1))){ans=Math.min(dp[j],ans);}

            }
            dp[i+1]=ans;
        }

// for(int i : dp){
//     System.out.print(i+" ");
// }

return dp[n];
    }
}