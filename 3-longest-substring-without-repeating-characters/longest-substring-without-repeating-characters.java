class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max=0,i=0,j=0,n=s.length();
        HashSet<Character> h= new HashSet<>();


        while(j<n){

            while(h.contains(s.charAt(j))){ 
                h.remove(s.charAt(i));
                i++;
            } 


            h.add(s.charAt(j));
            max=Math.max(j-i+1,max);
            j++;


        }

        return max;
       
    }
}