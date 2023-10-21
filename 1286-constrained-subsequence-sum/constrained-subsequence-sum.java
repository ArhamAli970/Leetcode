class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {

        Deque<Integer> dq= new LinkedList<>();
        int maxSum=Integer.MIN_VALUE;
        int sum=0,n=nums.length;
        
        for(int i=0;i<n;i++){ 

            int val=dq.isEmpty()?0:nums[dq.getFirst()];
            nums[i]=nums[i]+val;
            maxSum=Math.max(maxSum,nums[i]);
            if(nums[i]<0){nums[i]=0;}
            else{ 
                while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){ 
                    dq.removeLast();
                }
            }
            

            dq.add(i);

            while(!dq.isEmpty() && dq.getLast()-dq.getFirst()>=k){dq.removeFirst();}
        }



return maxSum;

        
    }
}