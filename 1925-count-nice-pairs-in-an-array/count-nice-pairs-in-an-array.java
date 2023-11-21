class Solution {
    public int countNicePairs(int[] nums) {
        int mod=1000000007;
        int n=nums.length;
        int[] rev=new int[n];

// having reverse of the array elements
        for(int i=0;i<n;i++){ 
              int val=nums[i];
              int r=0;
              while(val>0){ 
                int div=val%10;
                r=r*10+div;
                val/=10;
              }
              rev[i]=r;
        }

// having difference between the nums 
//   42 24  = 18(diff)  // 79 97 =18(diff)  // we will have 42

HashMap<Integer,Integer> mp= new HashMap<>();
long cnt=0;

for(int i=0;i<n;i++){ 
    int diff=nums[i]-rev[i];
    if(mp.containsKey(diff)){ 
            cnt=((cnt+mp.get(diff))%mod);
    }
 
 mp.put(diff,mp.getOrDefault(diff,0)+1);

}

return (int)cnt%mod;

    }
}