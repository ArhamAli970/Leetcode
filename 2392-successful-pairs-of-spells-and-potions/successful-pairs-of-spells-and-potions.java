class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n=spells.length;
        int m=potions.length;
        int ans[]=new int[n];
        
        Arrays.sort(potions);
        
        
        for(int i=0;i<n;i++){
            int st=0,end=m-1;
            int cnt=0;
            while(st<=end){
                int mid=(st+end)/2;
                long conc=(long)spells[i]*(long)potions[mid];
                if(conc>=success){
                    end=mid-1;
                    cnt=m-mid;
                }else{
                    st=mid+1;
                }
            }
            ans[i]=cnt;
            
        }
        
        
        
        return ans;
        
        
        
        
        
    }
}