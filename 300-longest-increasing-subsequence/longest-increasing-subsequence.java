class Solution {

public static int call(ArrayList<Integer> a,int num){ 
    int i=0,j=a.size()-1,idx=-1;
    while(i<=j){ 
        int mid=(i+j)/2;
        if(a.get(mid)>=num){idx=mid;j=mid-1;}
        else{i=mid+1;}
    }

    return idx;
}

    public int lengthOfLIS(int[] nums) {

        ArrayList<Integer> a= new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){ 
            if(a.size()==0 || a.get(a.size()-1)<nums[i]){ 
                a.add(nums[i]);
            }else{ 
                int getHighBond=call(a,nums[i]);
                a.set(getHighBond,nums[i]);
            }
        }
        return a.size();
    }
}