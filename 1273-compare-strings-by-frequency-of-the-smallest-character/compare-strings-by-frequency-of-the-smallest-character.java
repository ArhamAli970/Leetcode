class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n=queries.length;
        int m=words.length;
        
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){ 
        int cnt=0,min=26;
        int cnt1[]= new int[26];
         for(int j=0;j<queries[i].length();j++){ 
         ++cnt1[queries[i].charAt(j)-'a'];
             min=Math.min(queries[i].charAt(j)-'a',min); 
            
         }
         
            int c1=cnt1[min];
            
            for(int j=0;j<m;j++){ 
                int cnt2[]= new int[26];
                int min1=26;
                for(int k=0;k<words[j].length();k++){ 
                     ++cnt2[words[j].charAt(k)-'a'];
                    min1=Math.min(words[j].charAt(k)-'a',min1);
                }
                
                int c2=cnt2[min1];
                
                if(c1<c2){cnt++;}
                             
            
            }
            
            arr[i]=cnt;
        
        }
        
        return arr;
        
    }
}