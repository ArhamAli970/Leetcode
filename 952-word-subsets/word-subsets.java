class Solution {

public static boolean chkSubset(int cnt[],int cntSub[]){
      for(int i=0;i<26;i++){
          if(cnt[i]>cntSub[i]){return false;}
      }
      return true;
}

    public List<String> wordSubsets(String[] word1, String[] word2) {
        
        List<String> ans= new ArrayList<>();
        int cnt[]=new int[26];
        for(int i=0;i<word2.length;i++){
            int c[]=new int[26];
            for(int j=0;j<word2[i].length();j++){
                ++c[word2[i].charAt(j)-'a'];
            }

            for(int j=0;j<26;j++){
                cnt[j]=Math.max(cnt[j],c[j]);
            }

        }


        for(int i=0;i<word1.length;i++){
            int cntSub[]=new int[26];
            for(int j=0;j<word1[i].length();j++){
                ++cntSub[word1[i].charAt(j)-'a'];
            }

            if(chkSubset(cnt,cntSub)){
                ans.add(word1[i]);
            }


        }


return ans;


    }
}