class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans= new ArrayList<>();
        String str=words[0];

        int cnt[]=new int[26];

        for(int i=0;i<str.length();i++){
            ++cnt[str.charAt(i)-'a'];
        }


        for(int i=0;i<words.length;i++){
            int cnt1[]=new int[26];
            for(int j=0;j<words[i].length();j++){
                ++cnt1[words[i].charAt(j)-'a'];
            }

            for(int j=0;j<26;j++){
                cnt[j]=Math.min(cnt[j],cnt1[j]); 
            }
            
        }


        for(int i=0;i<26;i++){
            int c=cnt[i];
            char ch=(char)(i+'a');
            while(c-->0){
                ans.add(String.valueOf(ch));
            }
        }

return ans;


        
    }
}