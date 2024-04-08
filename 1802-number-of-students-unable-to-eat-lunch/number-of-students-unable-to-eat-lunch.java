class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

      LinkedList<Integer> l=new LinkedList<>();
      int n=sandwiches.length;

      for(int i=0;i<n;i++){l.add(students[i]);}

      for(int j=0;j<n;j++){
            int len=l.size();
            while(len>0){
                if(l.getFirst()==sandwiches[j]){
                    l.removeFirst();
                    break;
                }
                l.add(l.removeFirst());
                len--;
                if(len==0){return n-j;}
            }
      }


      return 0;

        
    }
}