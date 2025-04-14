class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int cnt=0,n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int c1=Math.abs(arr[i]-arr[j]);
                    int c2=Math.abs(arr[k]-arr[j]);
                    int c3=Math.abs(arr[k]-arr[i]);
                    if(c1<=a && c2<=b && c3<=c){cnt++;}
                }
            }
        }
        return cnt;
    }
}