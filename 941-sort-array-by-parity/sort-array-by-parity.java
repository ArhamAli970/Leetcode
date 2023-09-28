class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
int i=0,j=0;
while(i<nums.length){ 

if(nums[i]%2==0){ 
int val=nums[j];
nums[j]=nums[i];
nums[i]=val;
j++;
}
i++;
}
System.gc();

         return nums;


    }
}