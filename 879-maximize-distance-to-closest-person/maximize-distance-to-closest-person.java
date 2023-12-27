class Solution {
    public int maxDistToClosest(int[] seats) {
        int n=seats.length;
        int next[]= new int[n];
        int lst=Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){ 
            if(seats[i]==1){lst=i;}
            next[i]=lst-i;
        }

        int max=0;
        lst=-1000000;
        for(int i=0;i<n;i++){ 
            if(seats[i]==1){lst=i;}
            int min=Math.min(next[i],i-lst);
            max=Math.max(max,min);
        }
        
        return max;
    }
}