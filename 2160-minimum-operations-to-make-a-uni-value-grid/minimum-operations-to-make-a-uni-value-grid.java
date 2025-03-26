class Solution {
    public int minOperations(int[][] grid, int x) {
        int max=0,min=Integer.MAX_VALUE,n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(grid[i][j],max);
                min=Math.min(grid[i][j],min);
            }
        }

        int cnt[]=new int[max+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ++cnt[grid[i][j]];
            }
        }

        int tot=n*m;
        int pref[]=new int[max+1];
        int c=0,curr=0;
        // check for diff;
        for(int i=min;i<=max;i+=x){
            curr=curr+(c*x);
            pref[i]=curr;
            c+=cnt[i];
            tot-=cnt[i];
        }

        if(tot!=0){return -1;}

        c=0;curr=0;
        int mn=Integer.MAX_VALUE,val=-1;
        for(int i=max;i>=min;i-=x){
            curr=curr+c*x;
            pref[i]+=curr;
            c+=cnt[i];
            if(pref[i]<=mn){
                mn=pref[i];
                val=i;
            }
        }

        int cntOperation=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cntOperation+=(Math.abs(val-grid[i][j])/x);
            }
        }

        return cntOperation;

    }
}