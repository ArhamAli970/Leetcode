class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

 HashMap<String,ArrayList<Integer>> mp= new HashMap<>();
int chk=-1;
for(int i=0;i<wordList.size();i++){ 
    mp.put(wordList.get(i),new ArrayList<>());
    if(endWord.equals(wordList.get(i))){ 
        chk=1;
    }
}

if(chk==-1){return 0;}
             
        int n=wordList.size();
       
         HashSet<Integer> h= new HashSet<>();

        Queue<Integer> q= new LinkedList<>();
       
           
        for(int i=0;i<n;i++){ 
        
             int len=wordList.get(i).length();

            for(int j=i+1;j<n;j++){ 
                int cnt=0;
                if(i!=j){ 
                   for(int k=0;k<len;k++){ 
                       if(wordList.get(i).charAt(k)!=wordList.get(j).charAt(k)){ 
                                cnt++;
                       }
                   }
                if(cnt==1){mp.get(wordList.get(i)).add(j);
                    mp.get(wordList.get(j)).add(i);}

                }
            }
            int cnt=0;
             for(int k=0;k<len;k++){ 
                       if(wordList.get(i).charAt(k)!=beginWord.charAt(k)){ 
                                cnt++;
                       }
                   }
                if(cnt==1){q.add(i);h.add(i);}

        }

        // System.out.print(mp);

int cnt=0;  

while(!q.isEmpty()){ 
       
       int size=q.size();

       for(int i=0;i<size;i++){ 
           
           int idx=q.remove();

           if(wordList.get(idx).equals(endWord)){return cnt+2;}
           
           for(int j=0;j<mp.get(wordList.get(idx)).size();j++){ 
               if(!h.contains(mp.get(wordList.get(idx)).get(j))){
               q.add(mp.get(wordList.get(idx)).get(j));
               h.add(mp.get(wordList.get(idx)).get(j));
               }
           }


       }

       cnt++;

}



return 0;
        
        
    }
}