class Solution {
    public int minSizeSubarray(int[] nums, int target) {

        int tot=0;
    for(int i=0;i<nums.length;i++){ 
               tot+=nums[i];
    }

    int cnt=target/tot;

    int t=target-(cnt*tot);

    int i=0,j=0,n=nums.length;
    int sum=0,min=Integer.MAX_VALUE;

     while(i<n){ 

        while(sum<t){ 
            sum+=nums[j++%n];
        }

        if(sum==t){min=Math.min(j-i,min);}

        sum-=nums[i++];

    }



return min==Integer.MAX_VALUE?-1:(cnt*nums.length)+min;
        
        
        
    }
}