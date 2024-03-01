class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt=0,n=s.length();
           for(int i=0;i<n;i++){
               if(s.charAt(i)=='1'){cnt++;}
           }
   int zero=n-cnt;
StringBuilder sb= new StringBuilder();
           while(cnt-->1){
               sb.append('1');
           }

        
           while(zero-->0){
               sb.append('0');
           }

           sb.append('1');

           return sb.toString();


    }
}