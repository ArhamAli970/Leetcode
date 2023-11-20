class Solution {
    public int getWinner(int[] arr, int k) {

        int c=0,num=arr[0],n=arr.length;

        for(int i=1;i<n;i++){ 
            if(num>arr[i]){c++;
            }
            else{ 
                c=1;
                num=arr[i];
            }
             if(c==k){return num;}
        }

        return num;
        
    }
}