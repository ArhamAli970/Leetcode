class Solution {
    public long flowerGame(int n, int m) {
        
        long odd1=n/2,even1=n/2;
        if(n%2!=0){odd1++;}

        long odd2=m/2,even2=m/2;
        if(m%2!=0){odd2++;}

        return odd1*even2+ odd2*even1;


    }
}