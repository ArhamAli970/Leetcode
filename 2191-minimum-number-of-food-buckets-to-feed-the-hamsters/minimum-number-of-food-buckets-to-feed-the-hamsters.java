class Solution {
static int n;
public static boolean chk(String hamsters,int i){ 

    if(i-1>=0 && i+1<n && hamsters.charAt(i-1)=='H' && hamsters.charAt(i+1)=='H'){
        return false;
    }
    if(i-1<0 && i+1>=n){return false;}
    if(i-1<0 && i+1<n && hamsters.charAt(i+1)=='H'){return false;}
     if(i-1>=0 && i+1>=n && hamsters.charAt(i-1)=='H'){return false;}
return true;
}

    public int minimumBuckets(String hamsters) {

        // if()/

        n=hamsters.length();
        
        int i=0,cnt=0;

        while(i<n){

            if(hamsters.charAt(i)=='H'){ 
                if(!chk(hamsters,i)){return -1;}
                if(i+1<n && i+2<n && hamsters.charAt(i+1)=='.' && hamsters.charAt(i)=='H' ){ 
                    i+=2;
                }
                else  if(i+1<n &&  hamsters.charAt(i+1)=='.'){ 
                    i++;
                }
                cnt++;
            } 
                i++;
            
        }

return cnt;
    }
}