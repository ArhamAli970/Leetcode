class Solution {
    static int dp[];
    public static int dfs(int i,String[] words){ 

      if(dp[i]!=-1){return dp[i];}
      int max=0;

      for(int j=0;j<words.length;j++){
          if(words[i].length()!=words[j].length()-1){continue;}
          if(i==j){continue;} 
          
          int l=0,m=0;
          while( l<words[i].length() &&  m<words[j].length()){ 
              if(words[i].charAt(l)==words[j].charAt(m)){ 
                  l++;
              }
              m++;
          }

          if(l==words[i].length()){ 
            max=Math.max(dfs(j,words)+1,max);
          }

      }
      dp[i]=max;

      return dp[i];

    }

    public int longestStrChain(String[] words) {
        dp= new int[words.length];
        Arrays.fill(dp,-1);
        int max=0;
        for(int i=0;i<words.length;i++){ 
            max=Math.max(dfs(i,words),max);
        }

        return max+1;

    }
}