class Solution {
    public String sortVowels(String s) {


String arr1[]={ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

String arr2[]={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};




int alpha1[]= new int[26];
int alpha2[]= new int[26];

for(int i=0;i<s.length();i++){ 
    if(s.charAt(i)-'a'>=0 && s.charAt(i)-'z'<26){ 
       if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ){ 
           ++alpha2[s.charAt(i)-'a'];
       }

    }
    else{ 
        if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U' ){ 
           ++alpha1[s.charAt(i)-'A'];
       }
    }
}

// for(int i=0;i<26;i++){ 
//     System.out.println(alpha1[i]+" "+alpha2[i]);
// } 
StringBuilder sb= new StringBuilder(s);
    //  sb=sb.replace(1, 2, "f");


int i=0;
boolean isempty=false;
while(i<s.length() && !isempty){ 
 
 if(sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' ||sb.charAt(i)=='U' ||sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' ||sb.charAt(i)=='u'  ){ 
         for(int j=0;j<26;j++){ 
             if(alpha1[j]>0){  
                sb=sb.replace(i, i+1, arr1[j]);
                 --alpha1[j];isempty=true;break;
             }
         }
        
         if(!isempty){break;}
         isempty=false; 
 }

 i++;

}




isempty=false;
while( i<s.length() && !isempty){ 
 
 if(sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' ||sb.charAt(i)=='U' ||sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' ||sb.charAt(i)=='u' ){ 
         for(int j=0;j<26;j++){ 
             if(alpha2[j]>0){ 
                    sb=sb.replace(i, i+1, arr2[j]);
                 --alpha2[j];isempty=true;break;
             }
         }
        if(!isempty){break;}
         isempty=false;
 }
  
 i++;

}


return sb.toString();




        
    }
}