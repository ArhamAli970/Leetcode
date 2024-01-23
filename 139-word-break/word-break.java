class Solution {
    static HashSet<String> chk;
    static int dp[][];
    public static int call(String s,int i,int j){
        if(j==s.length() ){return i==j?1:0;}

if(dp[i][j]!=-1){return dp[i][j];}

int take=-1,notTake=-1;

        if(chk.contains(s.substring(i,j+1))){
             take=call(s,j+1,j+1);
        }
        notTake=call(s,i,j+1);

        dp[i][j]=(take==1 || notTake==1)?1:0;
        return dp[i][j];
        
    }
    public boolean wordBreak(String s, List<String> wordDict) {

        chk= new HashSet<>();
        int n=s.length();
        dp=new int[n][n];

for(int i[]:dp){
        Arrays.fill(i,-1);
}

        for(String i:wordDict){
            chk.add(i);
        }

        return call(s,0,0)==1;
        
    }
}