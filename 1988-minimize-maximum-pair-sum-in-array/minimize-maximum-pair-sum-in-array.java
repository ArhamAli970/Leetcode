class Solution {
    public int minPairSum(int[] nums) { 
        
        int m=0,n=nums.length;

        for(int i=0;i<n;i++){ 
            m=Math.max(m,nums[i]);
        }
         
        int ans[]=new int[m+1];

        for(int i=0;i<n;i++){ 
            ++ans[nums[i]];
        }

        int i=0,j=m; 
        int max= Integer.MIN_VALUE;

        while(i<=j){ 
           
           while(i<=j && ans[i]<=0){i++;}
           while(i<=j && ans[j]<=0){j--;}
           if(i>j){break;}
           max=Math.max(max,i+j);
           --ans[i];--ans[j];
        }

        return max;
        
    }
}