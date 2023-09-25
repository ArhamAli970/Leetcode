class Solution {
    public char findTheDifference(String s, String t) {
        int a[]= new int[26];
        for(int i=0;i<t.length();i++){ 
             ++a[t.charAt(i)-'a'];
        }

         for(int i=0;i<s.length();i++){ 
            --a[s.charAt(i)-'a'];
        }

        char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
};

        for(int i=0;i<26;i++){ 
            if(a[i]>=1){return ch[i];}
        }
        return 'X';
    }
}