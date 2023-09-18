class Solution {
    public int totalHammingDistance(int[] nums) {
    
    // int cntZero[]=new int[31];
    int cntOne[]=new int[31];
    int n=nums.length;

    for(int i=0;i<n;i++){ 
        int idx=0;
        while(nums[i]>0){ 
            if((nums[i]&1)!=0){ 
                ++cntOne[idx];
            }
            idx++;
            nums[i]>>=1;
        }
    }

    int tot=0;
    for(int i=0;i<31;i++){ 
        tot+=((n-cntOne[i])*cntOne[i]);
    }

    return tot;

    }
}