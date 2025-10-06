class Solution {
    public int findKthPositive(int[] arr, int k) {
        int st=0, end=arr.length;
        // 2-0-1 =1   (2-())
        if(k<arr[st])return k;
        // else if(arr[end-1]-end>k)return arr[end-1]+(k-arr[end-1]-end);

        int ans=0;
        end--;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]-(mid+1)<k){
                ans=arr[mid]+(k-(arr[mid]-(mid+1)));
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}