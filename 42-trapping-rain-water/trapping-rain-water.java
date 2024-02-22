class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];

        int maxRight=height[0],maxLeft=height[n-1];

        for(int i=1;i<n;i++){
            maxRight=Math.max(height[i],maxRight);
            right[i]=maxRight;
        }

        for(int i=n-2;i>=0;i--){
           maxLeft=Math.max(height[i],maxLeft);
         left[i]=maxLeft;
        }

        int water=0;

        for(int i=1;i<n-1;i++){
            water+=Math.min(left[i],right[i])-height[i];
        }

        return water;


    }
}