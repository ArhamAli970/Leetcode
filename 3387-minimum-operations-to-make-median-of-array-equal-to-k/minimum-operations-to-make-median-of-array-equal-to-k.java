class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int st=0,end=nums.length-1,n=nums.length;
        int md=n/2,max=-1;
        
        while(st<=end){
              int mid=(st+end)/2;
            
            if(nums[mid]>k){end=mid-1;}
            else{st=mid+1;max=Math.max(mid,max);}
            
        }
        
        // System.out.print(max);
        long cst=0;
        
        if(max>=md){
             for(int j=md;j<Math.min(n,max+1);j++){
                 cst+=Math.abs(k-nums[j]);
             }
        }else{
            
                    // System.out.print(md);

             for(int j=md;j>=Math.max(0,max+1);j--){
                 cst+=Math.abs(nums[j]-k);
             }
        }
        
        return cst;
        
    }
}