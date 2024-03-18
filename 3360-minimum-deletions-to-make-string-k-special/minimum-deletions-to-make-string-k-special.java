class Solution {

    public static int call(int i,int j,int k,int[] cnt){
        int diff=cnt[j]-cnt[i];
        if(diff<=k || i==j){return 0;}

        if(dp[i][j]!=-1){return dp[i][j];}

        int t1=call(i+1,j,k,cnt)+cnt[i];
        int t2=call(i,j-1,k,cnt)+(diff-k);

        dp[i][j]=Math.min(t1,t2);

        return dp[i][j];



    }
    

    static int dp[][];
    public int minimumDeletions(String word, int k) {
        
        int cnt[]= new int[26];
        int n=word.length();
        for(int i=0;i<n;i++){
            ++cnt[word.charAt(i)-'a'];
        }

        dp= new int[26][26];
        for (int i[]:dp){
            Arrays.fill(i,-1);
        }

        Arrays.sort(cnt);
        int i=0,j=25;
        while(cnt[j]==0){
            j--;
        }

        return call(i,j,k,cnt);

        

    }
}