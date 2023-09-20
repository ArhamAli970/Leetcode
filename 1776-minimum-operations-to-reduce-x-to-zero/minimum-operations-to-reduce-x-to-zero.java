class Solution {
    public int minOperations(int[] nums, int x) {

     
     int suffSum=0,n=nums.length;

     for(int i=n-1;i>=0;i--){ 
         suffSum+=nums[i];
     }

int j=0,i=-1,min=Integer.MAX_VALUE;


while( i<j && j<=n){ 
    if(suffSum==x){ 
       int dist=(n-j)+i+1;
       min=Math.min(dist,min); 
       if(j==n){break;}
       suffSum-=nums[j++]; suffSum+=nums[++i];
    }else if(suffSum>x){ 
    if(j==n){break;}
       suffSum-=nums[j++];
    }else{ 
        suffSum+=nums[++i];
    }
}

return min==Integer.MAX_VALUE?-1:min;
        
    }
}