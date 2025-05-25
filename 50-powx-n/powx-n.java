class Solution {
    
    public static double call(double x,long n){
        if(n==1){return x;}
       
        
        double ans=call(x,n/2);
        ans*=ans;
        
        if(n%2!=0){
           ans*=x;
        }
        
        return ans;
        
    }
    
    public double myPow(double x, int n) {
        if(n==0){return 1;}
        long pow=n;
        boolean neg=n<0?true:false;
        double ans =call(x,Math.abs(pow));
        return neg?(1.0/ans):ans;
        
    }
}