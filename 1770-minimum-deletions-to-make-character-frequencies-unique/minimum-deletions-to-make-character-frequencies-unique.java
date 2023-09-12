class Solution {
    public int minDeletions(String s) {
        
        int max=0,n=s.length();
        Stack<Integer> st= new Stack<>();
        
        int cnt[]= new int[26];

        for(int i=0;i<n;i++){ 
            ++cnt[s.charAt(i)-'a'];
            max=Math.max(cnt[s.charAt(i)-'a'],max);
        }

        int maxCnt[]= new int[max+1];
        for(int i=0;i<26;i++){ 
         ++maxCnt[cnt[i]];
        }

        for(int i=0;i<max+1;i++){ 
            if(i!=0 && maxCnt[i]==0){ 
               st.push(i);
            }
            // System.out.print(maxCnt[i]+" ");
        }   

// System.out.print(st);

        int ct=0;

        for(int i=max;i>0;i--){ 
              
              while(maxCnt[i]>1){ 
                  int val=st.isEmpty()?0:st.pop();
                  if(val>=i){continue;}
                  else{--maxCnt[i];
                  ct+= (i-val);}
                  
                }
             

           }

        
        
        return ct;

    }
}