class Solution {
    public boolean validPalindrome(String s) {

        int i=0,j=s.length()-1,cnt=0;
        int ch[]=new int[26];

        for( i=0;i<s.length();i++){ 
            ++ch[s.charAt(i)-'a'];
        }
i=0;
        while(i<j){ 
            if(cnt==0 && s.charAt(i)!=s.charAt(j)){ 
                if(ch[s.charAt(i)-'a']%2!=0){--ch[s.charAt(i)-'a'];i++;}
                else{--ch[s.charAt(j)-'a'];j--;}
                cnt++;
            }else if(cnt>0 && s.charAt(i)!=s.charAt(j)){ 
                return false;
            }
            else{
                --ch[s.charAt(i)-'a'];
                --ch[s.charAt(j)-'a'];
                i++;j--;
            }
        }

        return true;


        
    }
}