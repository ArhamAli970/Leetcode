class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {

        int n=s.length(), m=wordDict.size();
        // List<String> ans= new ArrayList<>();
        HashMap<Integer,ArrayList<String>> mp= new HashMap<>();

        HashSet<String> h= new HashSet<>();

        int dp[]=new int[n+1];
        dp[0]=1;


        for(int i=0;i<m;i++){
            h.add(wordDict.get(i));
        } 

        for(int i=0;i<n;i++){
                  
                String ans="";

                for(int j=i;j>=0;j--){
                    ans=s.charAt(j)+ans;
                    if(h.contains(ans) && dp[j]!=0){
                        
                        if(!mp.containsKey(i+1)){mp.put(i+1,new ArrayList<>());}
                        dp[i+1]=1;
                        ArrayList<String> a1=new ArrayList<>();
                        if(j==0){a1.add("");}
                        else{a1=mp.get(j);}

                        for(String l :a1){
                            if(l.length()>0){
                                 mp.get(i+1).add(l+" "+ans);
                            }else{
                               mp.get(i+1).add(ans);
                            }
                           
                        }

                    }

                }

        }


        return mp.get(n)==null?new ArrayList<>():mp.get(n);
        
    }
}