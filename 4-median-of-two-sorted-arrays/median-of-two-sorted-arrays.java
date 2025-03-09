class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int t=n+m;
        int i=0,j=0,cnt=0;
        double ans=0;
        while(i<n && j<m){
            cnt++;
            if(nums1[i]<nums2[j]){
                if((t%2==0 && cnt==(t/2)) || cnt==(t/2)+1)ans+=nums1[i];
                i++;
            }else{
                if((t%2==0 && cnt==(t/2)) || cnt==(t/2)+1)ans+=nums2[j];
                j++;
            }
        }

        while(i<n){
            cnt++;
            if((t%2==0 && cnt==(t/2)) || cnt==(t/2)+1)ans+=nums1[i];
            i++;

        }

        while(j<m){
            cnt++;
            if((t%2==0 && cnt==(t/2)) || cnt==(t/2)+1)ans+=nums2[j];
            j++;
        }

        return t%2==0?(ans*1.0)/2:ans*1.0;
        
    }
}