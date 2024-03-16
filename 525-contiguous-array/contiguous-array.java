class Solution {
    public int findMaxLength(int[] nums) {

int n=nums.length,cntZero=0,cntOne=0,maxAns=0;


HashMap<Integer,Integer> mp= new HashMap<>();
mp.put(0,-1);

    for(int i=0;i<n;i++){
        if(nums[i]==0) cntZero++;
        else{cntOne++;}
        int diff=cntZero-cntOne;
        if(!mp.containsKey(diff)){
            mp.put(diff,i);
        }else{
            maxAns=Math.max(maxAns,i-mp.get(diff));
        }
    }

    return maxAns;

    }
}