class Solution {
    public int minPatches(int[] arr, int n) {

        int i=0,cnt=0;
        long sum=0;

        while(sum<n){
            if(i==arr.length || sum+1<arr[i]){
                sum+=(sum+1);
                cnt++;
            }else{
                sum+=arr[i];
                i++;
            }
        }
        

        return cnt;
    }
}