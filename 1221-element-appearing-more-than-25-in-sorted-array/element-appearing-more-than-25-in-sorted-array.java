class Solution {
    public int findSpecialInteger(int[] arr) {
        int cnt=0,max=-1,num=-1;
        for(int i=1;i<arr.length;i++){ 
           if(arr[i]!=arr[i-1]){
               if(cnt>max){max=cnt;num=arr[i-1];}
                  cnt=0;
           }
           else{
            cnt++;
           }
        }
        if(cnt>max){max=cnt;num=arr[arr.length-1];}
        return num;
    }
}