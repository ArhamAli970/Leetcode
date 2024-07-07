class Solution {
    public int numWaterBottles(int nb, int ne) {
        int cnt=nb;
        while(nb>=ne){
            int n=nb/ne;
            int rem=nb%ne;
            nb=n+rem;
            cnt+=n;
        }

        return cnt;
        
    }
}