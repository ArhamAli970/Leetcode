class Solution {
    public int sumFourDivisors(int[] nums) {

    int totSum=0; 
    for(int i=0;i<nums.length;i++){ 
         int temp=0;int cnt=0;
         for(int j=1;j<=Math.sqrt(nums[i]);j++){ 
             if(j*j==nums[i]){cnt++; temp+=j;}
             else if(nums[i]%j==0){ 
                 temp+=j;
                 temp+=(nums[i]/j);
                 cnt+=2;
             }
         }
         if(cnt==4){ 
                 totSum+=temp;
             }
    }

    return totSum;
        
    }
}