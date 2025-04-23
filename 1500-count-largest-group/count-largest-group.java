class Solution {
    public int countLargestGroup(int n) {
        
        
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++){ 
            int num=i,sum=0;
            while(num>0){ 
            sum+=(num%10);
            num/=10;
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            max=Math.max(mp.get(sum),max);
        }
        
        int cnt=0;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
            if(e.getValue()==max){cnt++;}
        }
        
        return cnt;
        

        
    }
}