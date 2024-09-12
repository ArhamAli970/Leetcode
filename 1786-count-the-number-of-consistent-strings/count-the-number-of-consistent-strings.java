class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
       HashSet<Character> h=new HashSet<>();

       for(int i=0;i<allowed.length();i++){
        h.add(allowed.charAt(i));
       } 

       for(int i=0;i<words.length;i++){
        boolean consist=true;
          for(int j=0;j<words[i].length();j++){
               if(!h.contains(words[i].charAt(j))){
                  consist=false;break;
               }
          }

          if(consist){cnt++;}
       }

return cnt;
    }
}