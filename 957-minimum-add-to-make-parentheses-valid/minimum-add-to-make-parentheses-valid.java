class Solution {
    public int minAddToMakeValid(String s) {
        int cntR=0,cntL=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(cntL>0){cntL--;}
                else{cntR++;}
            }else{
                cntL++;
            }
        }

        return cntL+cntR;
    }
}