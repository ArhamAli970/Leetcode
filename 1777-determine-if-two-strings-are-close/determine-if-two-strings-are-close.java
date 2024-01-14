class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length()) return false;
        
        int arr1[]= new int[26];
        int arr2[]= new int[26];
        
        for(int i=0;i<word1.length();i++){ 
               ++arr1[word1.charAt(i)-'a'];
        }
        
         for(int i=0;i<word2.length();i++){  
             if(arr1[word2.charAt(i)-'a']==0)return false;
               ++arr2[word2.charAt(i)-'a'];
        }
        
        
        for(int i=0;i<26;i++){ 
            if(arr1[i]!=0){
            for(int j=0;j<26;j++){ 
            
                if(arr1[i]==arr2[j]){arr2[j]=0; break; }
                
                
            }
                
            }
            
        }
        
        
        for(int i=0;i<26;i++){ 
        if(arr2[i]!=0)return false;
        }
        
        return true;
        
        
        
    }
}