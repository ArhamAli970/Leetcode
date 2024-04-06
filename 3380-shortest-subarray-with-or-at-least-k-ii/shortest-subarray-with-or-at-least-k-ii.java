class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        
        int n=nums.length;
        int sum=0,i=0,len=Integer.MAX_VALUE;
        int cnt[]=new int[32] ;
        
        for(int j=0;j<n;j++){
             sum=(sum | nums[j]);
             int num=nums[j];
             for(int l=0;l<32;l++){
                if((num&1)!=0){
                    ++cnt[l];
                }
                 num>>=1;
             }
            
            while(i<=j && sum>=k){
                // System.out.print(sum+" ");
                len=Math.min(j-i+1,len);
                num=nums[i];
                    for(int l=0;l<32;l++){
                    if((num&1)!=0){
                        --cnt[l];
                        if(cnt[l]==0){sum=(sum& (~(1<<l)) );}
                    }   
                                num>>=1;
 
                }

                i++; 
            }
            
            
            
            
        }
        
        return len==Integer.MAX_VALUE?-1:len;
        
    }
}