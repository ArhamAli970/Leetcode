class Solution {
    static int par[];
public static int getPar(int v){
    if(par[v]==v){return v;}
    return  par[v]=getPar(par[v]);
}

    public int makeConnected(int n, int[][] connections) {
        int m=connections.length;
        if(n-1>connections.length){return -1;}

        par=new int[n];
        int sz[]=new int[n];
        for(int i=0;i<n;i++){par[i]=i;}
        Arrays.fill(sz,1);
        int cnt=n;

        for(int i=0;i<m;i++){
            int p1=getPar(connections[i][0]);
            int p2=getPar(connections[i][1]);

            if(p1==p2){continue;}

            int s1=sz[p1];
            int s2=sz[p2];

            if(s1>s2){
                sz[p1]+=s2;
                par[p2]=p1;
            }else{
                sz[p2]+=s1;
                par[p1]=p2;
            }
cnt--;

        }



        return cnt-1;
        

    }
}