class Solution {
    static int dp[];
    public static int call(int idx,int arr[],int d){ 
        if(dp[idx]!=-1){return dp[idx];} 

        int cnt1=0,cnt2=0,n=arr.length;
        int val=idx;
        

// by applying condition  i + x where: i + x < arr.length and  0 < x <= d. i am checking  who wil give me the max value 
        for(int i=idx+1;i<n && i<=val+d;i++){ 
            if(arr[idx]>arr[i]){ 
                cnt1=Math.max(call(i,arr,d),cnt1);
            }else{ 
                break;
            }
        }


        for(int i=idx-1;i>=0 && i>=val-d;i--){ 
            if(arr[idx]>arr[i]){ 
                cnt2=Math.max(call(i,arr,d),cnt2);
            }else{ 
                break;
            }
        }
       
// either you can go right or left then return the maxCount with +1 because you are also counted
        dp[idx]=Math.max(cnt1,cnt2)+1;
        return dp[idx];

    


    }
    public int maxJumps(int[] arr, int d) {
        
    int n=arr.length;
    dp=new int[n];
    Arrays.fill(dp,-1);
    int max=0;

// i am checking for every number in array where i should start so that i can have maximum count of index
    for(int i=0;i<n;i++){ 
     max=Math.max(max,call(i,arr,d));
    }

return max;
    }
}