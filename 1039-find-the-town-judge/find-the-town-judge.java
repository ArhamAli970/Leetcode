class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){return n;}
        int deg[]=new int[n+1];
        for(int i[]:trust){
            ++deg[i[1]];
            --deg[i[0]];
        }

        for(int i=0;i<=n;i++){
            if(deg[i]==n-1){return i;}
        }
        return -1;
    }
}