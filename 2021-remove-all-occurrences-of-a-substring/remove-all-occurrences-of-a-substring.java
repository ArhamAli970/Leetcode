class Solution {
    public static boolean chk(char ch[],String part,int i){
        if(i<part.length()-1){return false;}
        for(int j=part.length()-1;j>=0;j--){
            if(part.charAt(j)==ch[i]){i--;}
            else{return false;}
        }

        return true;
    }
    public String removeOccurrences(String s, String part) {
        int n=s.length(),m=part.length();
        if(m>n){return s;}
        char ch[]=new char[n];
        int i=0;

        for(int j=0;j<n;j++){
            char curr=s.charAt(j);
            ch[i]=curr;
            if(chk(ch,part,i)){
                i-=m;
            }
            i++;
        }


        StringBuilder sb=new StringBuilder();
        for(int l=0;l<i;l++){
            sb.append(ch[l]);
        }

        return sb.toString();

        
    }
}