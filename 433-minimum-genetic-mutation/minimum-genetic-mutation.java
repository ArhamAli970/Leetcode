class Solution {

    public static boolean chkMut(String s1,String s2){
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){c++;}
        }

        return c==1;
    }

    public static int call(String st,String end,String[] bnk,boolean[] vis){
        if(st.equals(end)){return 0;}
        int min=1000;
        for(int i=0;i<bnk.length;i++){
            if(!vis[i] && chkMut(bnk[i],st)){
                vis[i]=true;
                min=Math.min(min,call(bnk[i],end,bnk,vis)+1);
                vis[i]=false;
            }
        }

        return min;

    }
    public int minMutation(String startGene, String endGene, String[] bank) {
        boolean vis[]=new boolean[bank.length];
        int ans=call(startGene,endGene,bank,vis);
        return ans>=1000?-1:ans;

        
    }
}