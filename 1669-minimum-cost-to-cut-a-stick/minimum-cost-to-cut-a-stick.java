class Solution {
    static int dp[][];

    public static int call(int l,int m,int st,int end,int[] cuts){ 
        if(l>m){return 0;}
        int min=Integer.MAX_VALUE;

        if(dp[l][m]!=-1){return dp[l][m];}

        for(int i=l;i<=m;i++){ 

            int take1=call(l,i-1,st,cuts[i],cuts);
            int take2=call(i+1,m,cuts[i],end,cuts);
            min=Math.min(take1+take2+(end-st),min);

            // min=Math.min(dp[l][m],min);


                     
        }

        dp[l][m]=min;
return dp[l][m];
    }


    public int minCost(int n, int[] cuts) {
        int l= cuts.length;
        Arrays.sort(cuts);

        dp= new int[l][l];

        
            for(int i[]:dp){ 
                Arrays.fill(i,-1);
            }
        

        return call(0,l-1,0,n,cuts);
    

    }
}