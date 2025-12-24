class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tot=0;
        for(int i:apple){tot+=i;}

        int cap[]=new int[51];
        for(int i:capacity){
            ++cap[i];
        }

        int cnt=0;
        for(int i=50;i>0;i--){
            while(cap[i]>0){
                tot-=i;
                cnt++;
                if(tot<=0){break;}
                --cap[i];
            }
            if(tot<=0){break;}
        }

        return cnt;

    }
}