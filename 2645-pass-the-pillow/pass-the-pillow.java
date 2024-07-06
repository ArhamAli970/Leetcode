class Solution {
    public int passThePillow(int n, int time) {
        
        int nV=n-1;

        int rnd=time/nV;
        int lft=time%nV;

        if(rnd%2==0){
            return 1+lft;
        }

        return n-lft;

    }
}