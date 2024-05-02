class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int dp[]=new int[n+1];
        int currMax=0,cntMax=-1;
        for(int i=0;i<n;i++){
            int max=1,cnt=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                   if(dp[j+1]+1>max){max=dp[j+1]+1;
                    cnt=mp.get(j+1);}
                    else if(dp[j+1]+1==max){
                        cnt+=mp.get(j+1);
                    }
                }
            }
            dp[i+1]=max;
            if(currMax<max){currMax=max;cntMax=cnt;
            }
            mp.put(i+1,cnt);

        }

        // System.out.println(mp);
        // for(int i=0;i<=n;i++){
        //     System.out.print(dp[i]+" ");
        // }
        int c=0;

        for(int i=0;i<=n;i++){
            if(dp[i]==currMax){c+=mp.get(i);}
        }

return c;
    }
}