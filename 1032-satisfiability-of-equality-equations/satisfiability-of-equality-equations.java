class Solution {
    static int par[];

    public static int getPar(int v){
        if(par[v]==v){return v;}
        return par[v]=getPar(par[v]);
    }

    public boolean equationsPossible(String[] equations) {
      par=new int[26];
      int sz[]=new int[26];

    Arrays.fill(sz,1);
      for(int i=0;i<26;i++){
        par[i]=i;
    }

    for(int i=0;i<equations.length;i++){
        if(equations[i].charAt(1)!='!'){
            int curr1=equations[i].charAt(0)-'a';
            int curr2=equations[i].charAt(3)-'a';

            int p1=getPar(curr1);
            int p2=getPar(curr2);

            if(p1==p2){continue;}
            if(sz[p1]>sz[p2]){
                sz[p1]+=sz[p2];
                par[p2]=p1;
            }else{
                sz[p2]+=sz[p1];
                par[p1]=p2;
            }


        }
    }


    for(int i=0;i<equations.length;i++){
        int curr1=equations[i].charAt(0)-'a';
        int curr2=equations[i].charAt(3)-'a';

        int p1=getPar(curr1);
        int p2=getPar(curr2);

        if(p1==p2 && equations[i].charAt(1)=='!'){return false;}
        if(p1!=p2 && equations[i].charAt(1)=='='){return false;}

    }

    return true;
    }
}