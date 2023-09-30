class Solution {
    public boolean find132pattern(int[] nums) {
        
        // PriorityQueue<Integer> pq= new PriorityQueue<>();

        Stack<Integer> st= new Stack<>();
        int n=nums.length;

        // st.push(n-1);
        int i=n-1;

        // while(i>=0 && nums[st.peek()]>nums[i]){ 
        //     st.push(i--);
        // }

        boolean isPop=false;int max=Integer.MIN_VALUE;

        while(i>=0 ){ 
          
           if(!st.isEmpty() && nums[st.peek()]<nums[i]){ 
               while(!st.isEmpty() && nums[st.peek()]<nums[i]){ 
                   isPop=true;
                   max=Math.max(nums[st.pop()],max);
                   
               }
                
               st.push(i);
                // System.out.print(st.peek()+" ");
           }

           else if(isPop && nums[i]<nums[st.peek()] && nums[i]<max){ 
              
               return true;
           }
           else if(st.isEmpty() || nums[i]<nums[st.peek()] ){ 
               st.push(i);
           }
i--;

        }

return false;

    }
}