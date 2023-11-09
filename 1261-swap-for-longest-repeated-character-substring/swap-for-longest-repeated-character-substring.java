class Solution {

static char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  static  HashMap<Character,Integer> mp;

public static boolean chkCondition(int[] arr){ 
    int cntChar=0,cntGreat=0;
    char maxChar='\0';
    for(int i=0;i<26;i++){ 
        if(arr[i]>0){cntChar++;}
        if(arr[i]>1){cntGreat++; 
           maxChar=a[i];
        }

    }

    return cntChar>2 || cntGreat>1 || (maxChar!='\0' && mp.get(maxChar)-arr[maxChar-'a']==0);
}

    public int maxRepOpt1(String s) {
        
       int n=s.length();
       int arr[]= new int[26]; 
       int max=1;
       mp= new HashMap<>();
        
       for(int i=0;i<n;i++){ 
          mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
       }

       if(mp.size()==1){return n;}
       else if(mp.size()==n){return 1;}
   

       int i=0,j=0;

       while(j<n){ 
           
        ++arr[s.charAt(j)-'a'];

        while(chkCondition(arr)){ 
            max=Math.max(j-i,max);
            --arr[s.charAt(i++)-'a'];
        } 
            j++;
        


       }


       max=Math.max(j-i,max);

       return max;


        
        
        
    }
}