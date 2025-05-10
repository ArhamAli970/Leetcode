class Solution {
    public long minSum(int[] num1, int[] num2) {

        long sum1=0,sum2=0,cnt1=0,cnt2=0;
        for(int i:num1){
            if(i==0){cnt1++;}
            else{sum1+=i;}
        }

        for(int i:num2){
            if(i==0){cnt2++;}
            else{sum2+=i;}
        }

        if((cnt1==0 && sum1<sum2+cnt2) || (cnt2==0 && sum2<sum1+cnt1)){
            return -1;
        }

        return Math.max(sum1+cnt1,sum2+cnt2);
        
    }
}