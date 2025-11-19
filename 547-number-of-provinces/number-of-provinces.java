class Solution {

    public static int chkPar(int ele,int par[]){
        if(par[ele]==ele){return ele;}
        return par[ele]=chkPar(par[ele],par);
    }

    public int findCircleNum(int[][] isConnected) {
        // here we need to check the groups and the best algo for this is DSU
        int n=isConnected.length;
        int par[]=new int[n]; 
        int rank[]=new int[n];
        // Arrays.fill(par,-1);
        for(int i=0;i<n;i++){
            par[i]=i;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(isConnected[i][j]==1){

                    int p1=chkPar(i,par);
                    int p2=chkPar(j,par);

                    if(p1!=p2){
                        if(rank[p1]>rank[p2]){
                            par[p2]=p1;
                            rank[p1]+=p2;
                        }else{
                            par[p1]=p2;
                            rank[p2]+=p1;
                        }
                    }

                }
            }
        }

        HashSet h=new HashSet<>();
        for(int i=0;i<n;i++){
            par[i]=chkPar(i,par);
            h.add(par[i]);
        }

        return h.size();

        

    }
}