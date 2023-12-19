class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {

        Arrays.sort(nums);
        int n=nums.length;
        long pre[]=new long[n];
        long sum=0;
         List<Long> finAns= new ArrayList<>();

        for(int i=0;i<n;i++){ 
            sum+=nums[i];
            pre[i]=sum;
        }

        for(int i=0;i<queries.length;i++){ 
        long ans=0L;
            int st=0,end=n-1,lastIdx=-1;
            while(st<=end){ 
                int mid=(st+end)/2;
                if(nums[mid]>queries[i]){ 
                    end=mid-1;
                }else if(nums[mid]<=queries[i]){ 
                    lastIdx=mid;
                    st=mid+1;
                }
            }
            if(lastIdx!=-1){
            ans=((((long)lastIdx+1)*(long)queries[i])-(long)pre[lastIdx]);
            ans+=  (((long)pre[n-1]-(long)pre[lastIdx])) - ((long)(n-lastIdx-1)*(long)queries[i]);
            }
            else{ 
                ans+=(long)pre[n-1]-((long)n*(long)queries[i]);
            }
            
        
        finAns.add(ans);
        }

return finAns;
        
    }
}