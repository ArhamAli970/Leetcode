class Solution {
    public int numberOfMatches(int n) {
        
        int cnt=0;

        while(n>1){
            int val=(int)Math.ceil(n/2) ;
            cnt=cnt+val;
            if(n%2==0){n/=2;}
            else{
                n/=2;
                ++n;
            }
        }

return cnt;
    }
}