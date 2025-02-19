class Solution {

  static String ans;
  static int K;

   public static void call(StringBuilder sb, char arr[],char par,int n){
       if(n==0){
         K--;
         if(K==0){ans=sb.substring(0);}
         return;
       }

       for(int i=0;i<arr.length;i++){ 
         if(arr[i]!=par){ 
            sb.append(arr[i]);
            call(sb, arr,arr[i], n-1);
            sb.deleteCharAt(sb.length()-1);
         }
       }

   }

    public String getHappyString(int n, int k) {
        
      ans="";
      K=k;
      StringBuilder sb= new StringBuilder();
      char arr[]= {'a','b','c'};
      
      call(sb,arr,'\0',n);

      return ans.toString();


    }
}