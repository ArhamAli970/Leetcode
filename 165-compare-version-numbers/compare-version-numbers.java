class Solution {

 

    public int compareVersion(String v1, String v2) {
        int n=v1.length(),m=v2.length();
        int i=0,j=0;

        while(i<n || j<m){

           int num1=0,num2=0;

           if(i<n){
             StringBuilder sb=new StringBuilder();
              while(i<n && v1.charAt(i)!='.'){
                sb.append(v1.charAt(i));
                i++;
              }
              if(i<n){i++;}
              num1=Integer.valueOf(sb.toString());
              
           }

           if(j<m){
             StringBuilder sb=new StringBuilder();
              while(j<m && v2.charAt(j)!='.'){
                sb.append(v2.charAt(j));
                j++;
              }
              if(j<m){j++;}
              num2=Integer.valueOf(sb.toString());
           }

        //    System.out.println(num1+" "+num2);

           if(num1<num2){return -1;}
           else if(num2<num1){return 1;}

        }


return 0;


    }
}