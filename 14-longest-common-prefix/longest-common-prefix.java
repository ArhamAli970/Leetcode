class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String w1=strs[0];
        String w2=strs[strs.length-1];
        int i=0;
        for(i=0;i<Math.min(w1.length(),w2.length());i++){
            if(w1.charAt(i)!=w2.charAt(i)){break;}
        }
        return w1.substring(0,i);
        
    }
}