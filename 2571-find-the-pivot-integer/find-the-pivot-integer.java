class Solution {
    public int pivotInteger(int n) {

        int fin=((n*(n+1))/2);

        int st=1,end=n;

        while(st<=end){
            int mid=(st+end)/2;
            int sum1=((mid*(mid+1))/2);
            int midM1=mid-1;
            int sum2=((midM1*(midM1+1))/2);

            if(sum1>fin-sum2){
                end=mid-1;
            }
            else if(sum1<fin-sum2){
                st=mid+1;
            }else{
               return mid;
            }


        }


        return -1;

        
    }
}