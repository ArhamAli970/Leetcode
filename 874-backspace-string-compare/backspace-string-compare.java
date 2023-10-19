class Solution {
    public boolean backspaceCompare(String s, String t) {

       int n=s.length(),m=t.length();

       int ptr1=n-1,ptr2=m-1;

       while(true){ 

           if(ptr1>=0 && s.charAt(ptr1)=='#'){ 
               int cnt=0;
                while(ptr1>=0 && s.charAt(ptr1)=='#'){ 
                    cnt++;ptr1--;
                }
                while( ptr1>=0 && cnt>0 ){ 
                    if(s.charAt(ptr1)=='#'){cnt++;}
                    else{cnt--;}
                    ptr1--;}
           }

            else if(  ptr2>=0 && t.charAt(ptr2)=='#'){ 
               int cnt=0;
                while( ptr2>=0 &&  t.charAt(ptr2)=='#'){ 
                    cnt++;ptr2--;
                }
                while( ptr2>=0 && cnt>0){
                     if(t.charAt(ptr2)=='#'){cnt++;}
                    else{cnt--;}
                    ptr2--;}
           }
           else if( (ptr1<0 || ptr2<0) || s.charAt(ptr1)!=t.charAt(ptr2)){ 
               break;
           }else{ 
               ptr1--;ptr2--;
           }
       }

if(ptr1<0 && ptr2<0){return true;}

return false;


    }
} 