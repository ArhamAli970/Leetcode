class Solution {
    public List<Integer> partitionLabels(String s) {
      int n=s.length();
      int lastOccur[]=new int[26];

      for(int i=0;i<n;i++){ 
          lastOccur[s.charAt(i)-'a']=i;
      }
      List<Integer> l= new ArrayList<>();
      
      int lastIdx=0,max=0,prev=-1;
      for(int i=0;i<n;i++){ 
            max=Math.max(lastOccur[s.charAt(i)-'a'],max);
            if(i==max){
                l.add(max-prev);
                prev=i;
            }
      }

      return l;


    }
}