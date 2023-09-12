class Solution {
    public List<Integer> findAnagrams(String s, String p) {


        int n=s.length(),m=p.length();
        int cnt1[]= new int[26];
        int cnt2[]=new int[26];

        for(int i=0;i<m;i++){ 
            ++cnt1[p.charAt(i)-'a'];
        }

ArrayList<Integer> a= new ArrayList<>();
int i=0,j=0;
        while(j<n){
            ++cnt2[s.charAt(j)-'a']; 
           if(j-i+1==m){ 
              boolean chk=true;
               for(int k=0;k<26;k++){ 
                   if(cnt1[k]!=cnt2[k]){ 
                       chk=false;
                       break;
                   }
               }

               if(chk){a.add(i);}
             --cnt2[s.charAt(i)-'a'];
             i++;
           }
           j++;
        }

return a;
        
    }
}