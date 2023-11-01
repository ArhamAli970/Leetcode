class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        
        int arr1[]= new int[26];
        int arr2[]=new int[26];
        int n=s1.length();

        for(int i=0;i<n;i++){ 
            ++arr1[s1.charAt(i)-'a'];
        }
        for(int i=0;i<n;i++){ 
            ++arr2[s2.charAt(i)-'a'];
        }

int i=0,j=0,s1L=0,s2L=0;


    while(i<26 && j<26){ 

        while(i<26 && arr1[i]==0){
            i++;
        }
        while(i<26 && arr2[j]==0){
            j++;
        }
        if(i>=26 || j>=26){break;}
        if(i>j){s1L++;}if(j>i){s2L++;}


        --arr1[i];
        --arr2[j];

    }

    

    if(s1L>0 && s2L>0){return false;}

    return true;




    }
}