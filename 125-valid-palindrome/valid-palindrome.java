class Solution {
    public static boolean comb(char c1,char c2){
        boolean cond=Character.isLetter(c1) && Character.isLetter(c2);
        return cond && (c1-'a' == c2-'a' || c1-'a'==c2-'A' || c1-'A'==c2-'a' || c1-'A'==c2-'A');
    }
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(!Character.isLetterOrDigit(c1)){i++;}
            else if(!Character.isLetterOrDigit(c2)){j--;}
            else if((Character.isDigit(c1) && Character.isDigit(c2) && c1-'0'==c2-'0') || comb(c1,c2)){i++;j--;}
            else {return false;}
        }

        return true;
    }
}