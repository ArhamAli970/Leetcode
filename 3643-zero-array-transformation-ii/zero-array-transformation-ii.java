class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
         int n=nums.length;
        
        int m=queries.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        
        if(sum==0){return 0;}
        
        int st=0,end=m-1,ans=-1;
        
        while(st<=end){
        int chk=1,mid=(st+end)/2;
        int sm[]=new int[n];
        for(int i=0;i<=mid;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            sm[a]+=queries[i][2];
            if(b+1<n){sm[b+1]-=queries[i][2];}
            
            
        }
        
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=sm[i];
            if(curr<nums[i]){chk=-1;break;}
            
        }
            
            if(chk==-1){st=mid+1;}
            else{ans=mid+1;end=mid-1;}
            
        }
        
        return ans;
    }
}