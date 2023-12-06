class Solution {
    public int totalMoney(int n) {

       int lastMon=1;
       int money=0;

       for(int i=1;i<=n;i++){ 

          money+=lastMon;
           
          i++;
          int cnt=6,m=lastMon+1;
          while(i<=n && cnt>0){ 
             money+=m;
             i++;cnt--;m++;
          }

          if(i>n){break;}
          --i;
          lastMon++;

       }

return money;
    }
}