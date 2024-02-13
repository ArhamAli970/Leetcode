class Solution {

public static boolean checkPal(String s){
      int i=0,j=s.length()-1;
      while(i<j){
          if(s.charAt(i)!=s.charAt(j)){return false;}
          i++;j--;
      }

      return true;
}


    public String firstPalindrome(String[] words) {


for(int i=0;i<words.length;i++){
       if(checkPal(words[i])){
           return words[i];
       }
}

return "";

    }
}