class Solution {
    public int maximumCount(int[] nums) {
        int l=-1,n=nums.length,r=n;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]<0){l=mid;st=mid+1;}
            else{end=mid-1;}
        }

        st=0;end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>0){r=mid;end=mid-1;}
            else{st=mid+1;}
        }

        return Math.max(l+1,n-r);

        



    }
}