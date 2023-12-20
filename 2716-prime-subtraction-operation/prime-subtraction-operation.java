class Solution {
    static boolean  prime[]; 

    public static void sieveOfErathonoses(){ 
        for(int i=2;i<=Math.sqrt(prime.length);i++){ 
            if(!prime[i]) continue;
            for(int j=i*i;j<prime.length;j+=i){ 
                prime[j]=false;
            }
        }
    }

    public boolean primeSubOperation(int[] nums) {
int max=0;
        for(int i=0;i<nums.length;i++){ 
            max=Math.max(nums[i],max);
        }

        prime=new boolean[max+1];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        sieveOfErathonoses();


        
        for(int i=nums.length-2;i>=0;i--){ 
            if(nums[i]>=nums[i+1]){ 
                for(int j=2;j<prime.length;j++){ 
                    if(prime[j] && nums[i]-j>0 && nums[i]-j<nums[i+1]){nums[i]=nums[i]-j;break;}
                }
                if(nums[i]>=nums[i+1]) return false;
            }
        }
return true;
    }
}