class Solution {
    public int minSteps(String s, String t) {
        
        int n=s.length();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        
        for(int i=0;i<n;i++){ 
        ++arr1[s.charAt(i)-'a'];
        ++arr2[t.charAt(i)-'a'];
        }
        
        int cnt=0;
        for(int i=0;i<26;i++){ 
        if(arr2[i]-arr1[i]>0){ 
        cnt+=arr2[i]-arr1[i];
        }
        
        }
        
        return cnt;
    }
}