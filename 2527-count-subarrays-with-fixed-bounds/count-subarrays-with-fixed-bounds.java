class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int i=0,lstMin=-1,lstMax=-1,n=nums.length;
        long cnt=0;

        for(int j=0;j<n;j++){
            min=Math.min(nums[j],min);
            max=Math.max(nums[j],max);

            // System.out.println(min+" "+max+" "+lstMax+" "+lstMin);

            if(max>maxK || min<minK){
                lstMin=-1;lstMax=-1;min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
                i=j+1;
                continue;
            }

            if(nums[j]==minK){
                
                lstMin=j;
            }
            if(nums[j]==maxK){
                lstMax=j;
            }

            

            if(min==minK && max==maxK){
               
                int c=Math.min(lstMin,lstMax);
                //  System.out.println(i+" "+c);
                cnt+=(c-i+1);
            }



        }

        return cnt;

    }
}