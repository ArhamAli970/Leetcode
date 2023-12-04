class Solution {
    public String largestGoodInteger(String num) {

     int max=-1;
     for(int i=2;i<num.length();i++){ 
         if(num.charAt(i)-'0'==num.charAt(i-1)-'0' && num.charAt(i-1)-'0'==num.charAt(i-2)-'0'){
             max=Math.max(num.charAt(i)-'0',max);
         }
     }

     String ans="";
     if(max==-1){return ans;}
     ans+=String.valueOf(max);
     ans+=String.valueOf(max);
     ans+=String.valueOf(max);

     return ans;

    }
}