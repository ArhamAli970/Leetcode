class Solution {
    public int tribonacci(int n) {

        if(n==0 || n==1){return n;}
        if(n==2){return 1;}
        
        int prev1=0;
        int prev2=1;
        int prev3=1;
        int sum=0;

        for(int i=3;i<=n;i++){
            sum=prev1+prev2+prev3;
            prev1=prev2;
            prev2=prev3;
            prev3=sum;
        }

        return sum;

    }
}