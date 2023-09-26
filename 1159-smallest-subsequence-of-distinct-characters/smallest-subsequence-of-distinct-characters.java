class Solution {
    public String smallestSubsequence(String s) {
       int n=s.length();       
  int cntChar[]= new int[26];
  boolean chk[]= new boolean[26];
  Deque<Character> dq= new LinkedList<>();

  for(int i=0;i<n;i++){ 
    ++cntChar[s.charAt(i)-'a'];
  }

  for(int i=0;i<n;i++){ 
    int idx=s.charAt(i)-'a';
    if(!chk[idx]){ 
      while(!dq.isEmpty() && dq.getLast()>s.charAt(i) && cntChar[dq.getLast()-'a']>0){ 
          chk[dq.removeLast()-'a']=false;
      }
      dq.add(s.charAt(i));
      chk[idx]=true;
    }
     --cntChar[idx];
  }

StringBuilder sb= new StringBuilder();
 while(!dq.isEmpty()){ 
   sb.append(dq.remove());
 }

 return sb.toString();
 
    }
}