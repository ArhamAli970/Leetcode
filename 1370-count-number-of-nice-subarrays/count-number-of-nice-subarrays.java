class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int j=0,ck=0,cnt=0,tc=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){ck++;}
            while(ck>k){
                tc+=cnt;
                if(nums[j]%2!=0){ck--;cnt=0;}
                j++;
            }
            if(ck==k){cnt++;}
        }

        // System.out.print(cnt+" "+tc);

        while(ck==k){
            tc+=cnt;
            if(nums[j]%2!=0){break;}
            j++;
        }
    
return tc;
    }}