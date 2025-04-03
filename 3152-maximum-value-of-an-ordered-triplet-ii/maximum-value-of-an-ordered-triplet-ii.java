class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long max=0;
        int n=nums.length;
        Stack<Integer> st= new Stack<>();
        
        long max1=nums[0];
        
        st.push(n-1);
        
        for(int i=n-2;i>=2;i--){ 
              
            if(nums[i]>nums[st.peek()]){st.push(i);}
        
        }
        
        // System.out.print(st.peek());
        
        for(int i=1;i<n-1;i++){ 
        
            if(i>=st.peek()){st.pop();}
              // System.out.print(max1+" "+nums[i]+" "+nums[st.peek()]);
            long cal=(long) ((max1-(long)nums[i])*(long)nums[st.peek()]);
          
            max=Math.max(cal,max);
            
            max1=Math.max(nums[i],max1);
            
        
        }
        
        
        return max;
        
        
        
    }
}