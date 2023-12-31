class Solution {
    static int dp[][][];

    public static int call(int l,int m,int st,int end,int[] cuts){ 
        if(l>m){return 0;}
        int min=Integer.MAX_VALUE;

        for(int i=l;i<=m;i++){ 
            if(dp[l][m][i]==-1){
            int take1=call(l,i-1,st,cuts[i],cuts);
            int take2=call(i+1,m,cuts[i],end,cuts);
            dp[l][m][i]=take1+take2+(end-st);
            }

            min=Math.min(dp[l][m][i],min);


                     
        }

        return min;

    }


    public int minCost(int n, int[] cuts) {
        int l= cuts.length;
        Arrays.sort(cuts);

        dp= new int[l][l][l];

        for(int i=0;i<l;i++){ 
            for(int j[]:dp[i]){ 
                Arrays.fill(j,-1);
            }
        }

        return call(0,l-1,0,n,cuts);
    

    }
}