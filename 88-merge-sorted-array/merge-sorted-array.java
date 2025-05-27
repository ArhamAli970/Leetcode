class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int st=m-1,N=nums1.length,req=N-1;
        while(st>=0){
            nums1[req]=nums1[st];
            st--;
            req--;
        }

        int i=N-m,j=0,fin=0;
        while(i<N && j<n){
            if(nums1[i]>nums2[j]){
                nums1[fin]=nums2[j];
                j++;
            }else{
                nums1[fin]=nums1[i];
                i++;
            }fin++;
        }

        while(j<n){
            nums1[fin]=nums2[j];
            j++;
            fin++;
        }

    }
}