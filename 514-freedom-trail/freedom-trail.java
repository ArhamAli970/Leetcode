class Solution {
    static int dp[][];
    static int n,m;
    public static int call(int i,int j,String ring,String key){
        if(dp[i][j]!=-1){return dp[i][j];}
        if(j==key.length()){return 0;}
            
            int cnt1=0,cnt2=0;
            int minR=Integer.MAX_VALUE,minL=Integer.MAX_VALUE;
            for(int k=i;(k!=i || cnt1==0);k=(k+1)%n){
                if(ring.charAt(k)==key.charAt(j)){minR=k;break;}
                cnt1++;
            }


            for(int k=i;(k!=i || cnt2==0);k=(n+(k-1))%n){
                if(ring.charAt(k)==key.charAt(j)){minL=k;break;}
                cnt2++;
            }

            int takeLft=call(minL,j+1,ring,key)+cnt2+1;
            int takeRht=call(minR,j+1,ring,key)+cnt1+1;
            dp[i][j]=Math.min(takeLft,takeRht);
           

           return dp[i][j];
        }
    public int findRotateSteps(String ring, String key) {
        n=ring.length();m=key.length();
        dp= new int[n+1][m+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return call(0,0,ring,key);
    }
}