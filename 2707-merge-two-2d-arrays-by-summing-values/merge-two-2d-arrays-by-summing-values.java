class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashSet<Integer> h=new HashSet<>();
        for(int i[]:nums1){h.add(i[0]);}
        for(int i[]:nums2){h.add(i[0]);}

        int ans[][]=new int[h.size()][2];

        int i=0,j=0,n=nums1.length,m=nums2.length,idx=0;
        while(i<n || j<m){
            if(j>=m ||(i<n && nums1[i][0]<nums2[j][0])){
                ans[idx][0]=nums1[i][0];ans[idx][1]=nums1[i][1];
                i++;
            }else if(i>=n || nums1[i][0]>nums2[j][0]){
                ans[idx][0]=nums2[j][0];ans[idx][1]=nums2[j][1];
                j++;
            }else{
                ans[idx][0]=nums1[i][0];
                ans[idx][1]=nums1[i][1]+nums2[j][1];
                i++;j++;
            }
            idx++;
        }

        return ans;
        
    }
}