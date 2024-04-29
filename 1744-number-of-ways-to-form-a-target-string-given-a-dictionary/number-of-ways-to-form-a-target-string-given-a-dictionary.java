class Solution {
    static long dp[][];
    static int md=1000000007;
    static HashMap<Integer,HashMap<Character,Integer>>  mp;
    public static long call(int i,int idx,String words[],String target){
        if(idx==target.length()){return 1;}
        else if(i==words[0].length()){return 0;}

        if(dp[i][idx]!=-1){return dp[i][idx];}

        long take1=0,take2=0,nTake=0;
        if(mp.get(i).containsKey(target.charAt(idx))){
            take1=call(i+1,idx+1,words,target)*mp.get(i).get(target.charAt(idx));
        }

        nTake=call(i+1,idx,words,target);

        dp[i][idx]=(take1+nTake)%md;
        return dp[i][idx];


    }
    public int numWays(String[] words, String target) {
        int n=words[0].length(),m=target.length();
        dp= new long[n+1][m+1];

        for(long i[]:dp){
            Arrays.fill(i,-1);
        }

        mp=new HashMap<>();

        for(int j=0;j<words[0].length();j++){
            HashMap<Character,Integer> m1= new HashMap<>();
            for(int i=0;i<words.length;i++){
                char ch=words[i].charAt(j);
                m1.put(ch,m1.getOrDefault(ch,0)+1);
            }
            mp.put(j,m1);
        }

        return (int)call(0,0,words,target);
        
    }
}