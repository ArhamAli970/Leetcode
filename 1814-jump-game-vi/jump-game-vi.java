class Solution {
    static class node implements Comparable <node>{ 
       int idx,max;
       node(int idx,int max){ 
           this.idx=idx;this.max=max;
       }

       @Override
       public int compareTo(node p1){ 
           return p1.max-this.max;
       }
    }
    // static int dp[]; 
    static PriorityQueue<node> pq;
    public static void call(int nums[],int k,int i){ 
        
        if(i==nums.length-1){ 
          pq.add(new node(i,nums[nums.length-1]));
          return;
        //   return nums[nums.length-1];
        }
        
        // if(dp[i]!=Integer.MIN_VALUE){ 
        //    return dp[i];
        // }
        
        // long max=Integer.MIN_VALUE;
        // int minSize=Math.min(nums.length-1,i+k);
        
        call(nums,k,i+1);
    
        
        while(pq.peek().idx>i+k){
            pq.remove();
        }

        int ans=pq.peek().max+nums[i];
        pq.add(new node(i,ans));
        
         
    }
    public int maxResult(int[] nums, int k) {
        
        int n=nums.length;
        // dp= new int[n];
        pq= new PriorityQueue<>();
        
        // Arrays.fill(dp,Integer.MIN_VALUE);
        call(nums,k,0);

        while(pq.peek().idx!=0){ 
            pq.remove();
        }

        return pq.remove().max;
        
        
        
    }
}