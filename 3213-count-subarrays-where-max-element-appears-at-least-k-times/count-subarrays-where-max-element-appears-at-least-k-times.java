class Solution {
    public long countSubarrays(int[] nums, int k) {

     long cnt=0;
     int max=0;

     for(int i:nums){
        max=Math.max(i,max);
     }

    int i=0,j=0,n=nums.length,cntK=0;


     while(j<n){

        while(j<n && cntK<k){
            if(nums[j]==max){cntK++;}
            j++;
        }
        j--;

        while(cntK>=k){
            if(nums[i]==max){cntK--;}
            cnt+=n-j;
            i++;
        }

        if(j==n-1){break;}
        j++;

     }

return cnt;

    }
}