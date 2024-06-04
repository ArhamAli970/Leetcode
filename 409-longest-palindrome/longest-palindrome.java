class Solution {
    public int longestPalindrome(String s) {

        int cnt1[]=new int[26];
        int cnt2[]=new int[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a'>=0 && 'z'-s.charAt(i)<26){
                ++cnt1[s.charAt(i)-'a'];
            }else{
                ++cnt2[s.charAt(i)-'A'];
            }
        }

int odd=0,cnt=0;

    for(int i=0;i<26;i++){
        cnt+=(cnt1[i]%2==0)?cnt1[i]:cnt1[i]-1;
        cnt+=(cnt2[i]%2==0)?cnt2[i]:cnt2[i]-1;
        if(cnt1[i]%2!=0){odd=1;}
        if(cnt2[i]%2!=0){odd=1;}
    }

return cnt+odd;

        
    }
}