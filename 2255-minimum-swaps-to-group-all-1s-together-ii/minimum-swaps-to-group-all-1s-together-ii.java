class Solution {
    public int minSwaps(int[] nums) {

        int i=0,j=0,size=0,n=nums.length;

        for(i=0;i<nums.length;i++){if(nums[i]==1){size++;}}

        if(size==n){return 0;}

int cnt=0;
        for(j=0;j<size;j++){
            if(nums[j]==0){cnt++;}
        }
    int min=cnt;
    i=0;

        while(i<n){

            if(nums[i]==0){cnt--;}
            if(nums[j]==0){cnt++;}
            i++;
            j=(j+1)%n;
            min=Math.min(cnt,min);
        }

        return min;
        
    }
}