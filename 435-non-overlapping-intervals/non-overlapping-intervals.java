class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
        int cnt=0;
        Arrays.sort(inter,(a,b)->{
            return a[1]-b[1];
        });

    // zyada jagah n ghire mire agle wale se
    int end=inter[0][1];

    for(int i=1;i<inter.length;i++){
        if(inter[i][0]<end){cnt++;}
        else{end=inter[i][1];}
    }

    return cnt;


    }
}