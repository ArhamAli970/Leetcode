class Solution {

    public static boolean chk(int md,int pos[],int m){
        int init=pos[0];
        --m;
        for(int i=1;i<pos.length;i++){
            if(pos[i]-init>=md){
                m--;
                init=pos[i];
            }
        }

        return m<=0;
    }

    public int maxDistance(int[] position, int m) {
        int ans=-1,st=0,end=1000000000;

        Arrays.sort(position);

        while(st<=end){
            int md=(st+(end-st)/2);
            if(chk(md,position,m)){
                ans=md;
                st=md+1;
            }else{
                end=md-1;
            }
        }

return ans;
        
    }
}