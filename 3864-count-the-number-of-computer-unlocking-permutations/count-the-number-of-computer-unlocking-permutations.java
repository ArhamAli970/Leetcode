class Solution {
    public int countPermutations(int[] complexity) {
        long fact=1;
        int md=1000000007;
        int mn=complexity[0];
        for(int i=0;i<complexity.length;i++){
            if(i>0){fact*=i; fact%=md;}
            if(i>0 && mn>=complexity[i]){return 0;}
        }

        return (int)fact;
    }
}