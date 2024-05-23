class Solution {
static int diff, cnt;

public static boolean canTake(int nums[],int i,HashMap<Integer,Integer> mp){
    if(mp.containsKey(nums[i]+diff) || mp.containsKey(nums[i]-diff)){
        return false;
    }

    return true;
}

public static void call(int i,int nums[],HashMap<Integer,Integer> mp){

    if(i==nums.length){
        cnt++;
        return;
    }

    if(canTake(nums,i,mp)){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        call(i+1,nums,mp);
        mp.put(nums[i],mp.get(nums[i])-1);
        if(mp.get(nums[i])==0){mp.remove(nums[i]);}
    }

    call(i+1,nums,mp);

}

    public int beautifulSubsets(int[] nums, int k) {
        cnt=0;
        diff=k;
        call(0,nums,new HashMap<>());

        return cnt-1;
        
    }
}