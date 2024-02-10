class Solution { 
    static int n;

public static int eveLen(int i, String s){
    int st=i-1,end=i+1,sum=0;

    while(st>=0 && end<n){
        if(s.charAt(st)!=s.charAt(end)){break;}
        sum++;
        st--;end++;
    }
    return sum;
}


public static int oddLen(int i, String s){
    int st=i,end=i+1,sum=0;

    while(st>=0 && end<n){
        if(s.charAt(st)!=s.charAt(end)){break;}
        sum++;
        st--;end++;
    }
    return sum;
}



    public int countSubstrings(String s) {
n=s.length();
int sum=0;
for(int i=0;i<n;i++){
      
    int eve=eveLen(i,s);
    int odd=oddLen(i,s);
    sum+=(odd+eve+1);
}

return sum;
        
    }
}