class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->{return a[0]-b[0];});

        ArrayList<int[]> arr=new ArrayList<>();

        int st=inter[0][0],end=inter[0][1];

        for(int i=0;i<inter.length;i++){
            if(inter[i][0]>end){
                arr.add(new int[2]);
                arr.get(arr.size()-1)[0]=st;
                arr.get(arr.size()-1)[1]=end;
                st=inter[i][0];
                end=inter[i][1];
            }
            else{
                end=Math.max(end,inter[i][1]);
            }
        }


        arr.add(new int[2]);
        arr.get(arr.size()-1)[0]=st;
        arr.get(arr.size()-1)[1]=end;

        int n=arr.size();
        int ans[][]=new int[n][2];

        for(int i=0;i<n;i++){
            ans[i][0]=arr.get(i)[0];
            ans[i][1]=arr.get(i)[1];
        }

        return ans;

        
    }
}