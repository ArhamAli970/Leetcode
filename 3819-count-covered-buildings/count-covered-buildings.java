class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        HashMap<Integer,int[]> rw=new HashMap<>();
        HashMap<Integer,int[]> cl=new HashMap<>();

        for(int i=0;i<buildings.length;i++){
            int row=buildings[i][1];  // 
            int col=buildings[i][0];
            int[] w=rw.getOrDefault(row,new int[]{Integer.MAX_VALUE,0});
            int[] h=cl.getOrDefault(col,new int[]{Integer.MAX_VALUE,0});
            w[0]=Math.min(w[0],col);
            w[1]=Math.max(w[1],col);
            h[0]=Math.min(h[0],row);
            h[1]=Math.max(h[1],row);
            rw.put(row,w);
            cl.put(col,h);
        }
        int cnt=0;
        

        for(int i=0;i<buildings.length;i++){
            int[] w_max=rw.get(buildings[i][1]);
            int[] h_max=cl.get(buildings[i][0]);
            if(h_max[0]<buildings[i][1] && h_max[1]>buildings[i][1] && w_max[0]<buildings[i][0] && w_max[1]>buildings[i][0]){cnt++;}
        }
 return cnt;       
    }
}