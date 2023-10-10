class Solution {
    public int minOperations(int[] nums) {
        
        Arrays.sort(nums);
       int max=-1,n=nums.length;

       int rep[]=new int[n];
      
       for(int i=0;i<n;i++){ 
            
          int st=0,end=i,lst=i;

          while(st<=end){ 
              int mid=(st+end)/2;

                if(nums[i]-nums[mid]<n){ 
                    lst=mid;
                    end=mid-1;
                }else{ 
                    st=mid+1;
                }


          }
          if(i-1>=0){ 
              if(nums[i]==nums[i-1]){rep[i]=rep[i-1];}
              else{rep[i]=rep[i-1]+1;}
          }
          max=Math.max(rep[i]-rep[lst]+1,max);

       }

       return n-max;

       

    }
}