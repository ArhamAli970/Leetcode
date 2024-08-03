class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int cnt1[]=new int[1001];
        int cnt2[]=new int[1001];

        for(int i=0;i<arr.length;i++){
            ++cnt1[target[i]];
            ++cnt2[arr[i]];
        }

        for(int i=0;i<1001;i++){
            if(cnt1[i]!=cnt2[i])return false;
        }

        return true;


    }
}