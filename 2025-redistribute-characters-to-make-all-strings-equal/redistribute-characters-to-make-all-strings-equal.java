class Solution {
    public boolean makeEqual(String[] words) {

        int cnt[]= new int[26];
        int n=words.length;

        for(int i=0;i<n;i++){ 
            for(int j=0;j<words[i].length();j++){ 
               ++cnt[words[i].charAt(j)-'a'];
            }
        }


        for(int i=0;i<26;i++){ 
            if(cnt[i]%n!=0){return false;}
        }

        return true;
        
    }
}