class Solution {
    static int dp[][];
    static int n,m;
    
    public static int call(int i,int j,String s,String p,boolean rep[]){
        if(i==n && j==m){return 1;}
        if(j==m){return 0;}
        if(i==n){
            for(int k=j;k<m;k++){
                if(p.charAt(k)!='*' && rep[k]==false){return 0;}
            }
            return 1;
        }
        if(dp[i][j]!=-1){return dp[i][j];}
        int ans=0;
        if(rep[j]){
            ans+=call(i,j+2,s,p,rep)==1?1:0;
            for(int k=i;k<n;k++){
                if(p.charAt(j)=='.' || (p.charAt(j)==s.charAt(k))){
                    ans+=call(k+1,j+2,s,p,rep)==1?1:0;
                }else{
                    break;
                }
                
            }
        }
        else if(p.charAt(j)==s.charAt(i) || p.charAt(j)=='.'){ans+=call(i+1,j+1,s,p,rep)==1?1:0;}
        return dp[i][j]= ans>0?1:0;
    }
    
    public boolean isMatch(String s, String p) {
        n=s.length();m=p.length();
        dp=new int[n][m];
        
        boolean rep[]=new boolean[m];
        for (int i=1;i<m;i++){
            if(p.charAt(i)=='*'){rep[i-1]=true;}
        }

        for(int i[]:dp){Arrays.fill(i,-1);}
        return call(0,0,s,p,rep)==1;
            
    }
}