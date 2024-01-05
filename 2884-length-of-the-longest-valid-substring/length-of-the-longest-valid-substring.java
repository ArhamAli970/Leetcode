class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        
        HashSet<String> h= new HashSet<>();

        for(int i=0;i<forbidden.size();i++){ 
            h.add(forbidden.get(i));
        }
        
        boolean chng=true;

        int i=0,j=0,n=word.length(),max=0;

        while(j<n){ 
            int lst=Math.max(i,j-11);
            for(int k=j;k>=lst;k--){ 
                if(h.contains(word.substring(k,j+1))){ 
                    i=k+1;
                    break;
                }
            }

           
            j++;
             max=Math.max(j-i,max);
           
        }

return max;
    }
}