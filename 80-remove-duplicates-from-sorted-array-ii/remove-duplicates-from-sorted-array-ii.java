class Solution {
    public int removeDuplicates(int[] arr) {
        int i=1,n=arr.length,cnt=1;
        for(int j=1;j<n;j++){
            if(arr[j]==arr[j-1]){
                cnt++;
            }
            else{cnt=1;}
            if(cnt<=2){
                arr[i]=arr[j];
                i++;
            }
        }

        return i;
    }
}