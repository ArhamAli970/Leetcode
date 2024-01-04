class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int i=0,j=0,n=nums.length,max=0;
        System.out.print(n);
        long sum=0;
        Arrays.sort(nums);

        while(j<n){ 
         if(j-1>=0){sum+=(long) (j-i)*(nums[j]-nums[j-1]);}
                

            while(sum>k){ 
              
                sum-=(nums[j]-nums[i]);
                i++;
            }

            
            max=Math.max(j-i,max);
            j++;
        }

        return max+1;

    }
}