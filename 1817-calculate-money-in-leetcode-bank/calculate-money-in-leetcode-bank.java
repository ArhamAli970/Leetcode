class Solution {
    public int totalMoney(int n) {

    int rem=n%7;
    int cnt=(n/7);
    int tot= (cnt*(2*28+(cnt-1)*7))/2;

    ++cnt;
    while(rem>0){ 
       tot+=cnt;
       cnt++;
       rem--;
    }

    return tot;






     
    }
}