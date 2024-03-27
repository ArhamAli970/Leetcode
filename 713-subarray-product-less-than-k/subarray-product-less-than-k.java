class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int i=0,j=0,max=0,n=nums.length,cntSub=0;
        long prod=1;

        while(j<n){

            while(j<n && prod*nums[j]<k){
                prod*=nums[j];
                j++;
            }
            if(j==i){i++;j++; continue;}
            int rem=max>i?max-i:0;
            int diff=j-i;
            cntSub+= (((diff)*(diff+1))/2)-((rem*(rem+1))/2);

            max=Math.max(max,j);
            if(j==n){break;}

            while(i<j && prod*nums[j]>=k){
                prod/=nums[i];
                i++;
            }

            


        }

        return cntSub;
        
    }
}