class Solution {
   
    public boolean checkArray(int[] nums, int k) {
        
        
     int i=0,n=nums.length,sum=0;
     Queue<Integer> q= new LinkedList<>();
        
        while(i<n){ 

            if(!q.isEmpty() && i-k>=0){sum-=q.remove();}

            int val=nums[i]-sum;
            
            if(k+i-1<n){
            if(val<0){return false;}
            q.add(val);
            sum+=val;
            }else{ 
               if(val!=0){return false;}
            }
            i++;
        }

        return true;
        
        
    }
}