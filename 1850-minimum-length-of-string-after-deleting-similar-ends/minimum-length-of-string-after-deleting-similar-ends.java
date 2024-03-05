class Solution {
    public int minimumLength(String s) {
        if(s.length()==1){return 1;}
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i) ==s.charAt(j)){
            while(i<s.length() && s.charAt(i)==s.charAt(j)){
                i++;
            }

            while(j>=0 && s.charAt(j)==s.charAt(i-1)){
                j--;
            }}
            else{
                return j-i+1;
            }
            if(i==j){return 1;}
        }

        return 0;



    }
}