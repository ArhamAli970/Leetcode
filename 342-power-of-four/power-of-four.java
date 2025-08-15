class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){return false;}
        if(n==1){return true;}
        return (n&(n-1))==0 && Math.sqrt(n)%2==0;
    
        
    }
}