class Solution {
    public String reverseWords(String s) {
         StringBuilder sb= new StringBuilder();
 StringBuilder finsb= new StringBuilder();
 for (int i=0;i<s.length();i++){ 
if(s.charAt(i)==' '){ 
finsb.append(sb.reverse()); 
finsb.append(' ');
sb= new StringBuilder();
}
else{ 
sb.append(s.charAt(i));
}
 }
 finsb.append(sb.reverse());
 return finsb.toString();
    }
}