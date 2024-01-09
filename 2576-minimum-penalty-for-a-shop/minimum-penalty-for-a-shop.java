class Solution {
    public int bestClosingTime(String customers) {

        int cnt=0,n=customers.length();

        for(int i=0;i<n;i++){ 
            if(customers.charAt(i)=='Y'){cnt++;}
        }

        int min=cnt,ans=0;

        for(int i=0;i<n;i++){ 
             if(customers.charAt(i)=='Y'){--cnt;}
            if(customers.charAt(i)=='N'){++cnt;}
          
            if(cnt<min){
                cnt=min;
                ans=i+1;
            }
           
            

        }


        return ans;
        
    }
}