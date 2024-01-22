class Solution {
    static int dp[][];

public static int call(int i,int j,String word1, String word2){
    if(j==word2.length()){
        return word1.length()-i;
    }if(i==word1.length()){
        return word2.length()-j;
    }

    if(dp[i][j]!=-1){return dp[i][j];}

if(word1.charAt(i)==word2.charAt(j)){
    dp[i][j]=call(i+1,j+1,word1,word2);
}else{

int del=call(i+1,j,word1,word2);
int add=call(i,j+1,word1,word2);
int rep=call(i+1,j+1,word1,word2);

dp[i][j]=Math.min(del,Math.min(add,rep))+1;

}

return dp[i][j];



}


    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        dp= new int[n][m];

        for(int i[]:dp){
            Arrays.fill(i,-1);
        }

        return call(0,0,word1,word2);
        
    }
}