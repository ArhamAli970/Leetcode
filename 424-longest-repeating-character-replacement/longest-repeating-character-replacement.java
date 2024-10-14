class Solution {
    public static int getMax(int cnt[]){
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(cnt[i],max);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int cnt[]=new int[26];

        int i=0,ans=0;
        for(int j=0;j<s.length();j++){
            ++cnt[s.charAt(j)-'A'];
            int max=getMax(cnt);
            int curr=j-i+1;
            while(curr-max>k){
                --cnt[s.charAt(i)-'A'];
                max=getMax(cnt);
                i++;
                curr=j-i+1;
            }
            ans=Math.max(ans,j-i+1);
        }

        return ans;
        
    }
}