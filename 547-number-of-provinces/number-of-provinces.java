class Solution {
    static int par[];
    public static int getPar(int v){
        if(par[v]==v){return v;}
        return par[v]=getPar(par[v]);
    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length,cnt=n;
        par=new int[n];
        int sz[]=new int[n];

        for(int i=0;i<n;i++){
            par[i]=i;
        }

        Arrays.fill(sz,1);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    int p1=getPar(i);
                    int p2=getPar(j);

                    if(p1==p2){continue;}

                    cnt--;
                    if(sz[p1]>sz[p2]){
                        sz[p1]+=sz[p2];
                        par[p2]=p1;
                    }else{
                        sz[p2]+=sz[p1];
                        par[p1]=p2;
                    }

                }
            }
        }
        
        return cnt;
    }
}