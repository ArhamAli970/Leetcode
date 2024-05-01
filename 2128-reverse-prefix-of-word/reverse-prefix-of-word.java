class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        int occ=-1;
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                occ=i;break;
            }
        }

        if(occ==-1){return word;}

        StringBuilder sb= new StringBuilder();

        for(int j=occ;j>=0;j--){
            sb.append(word.charAt(j));
        }

        return sb.toString()+word.substring(occ+1);


    }
}