class Solution {
    static int dp[][][];


    public static int call(int i,int prev,HashMap<Integer,HashMap<Integer,Integer>> mp,int m,int n){

        if(i==m){
            return 0;
        }



        int min=1000000000;

        for(int num=0;num<=9;num++){
            if(num==prev){continue;}
            if(dp[i][prev][num]!=-1){
                min=Math.min(min,dp[i][prev][num]);
            }else{
               int cnt=!mp.get(i).containsKey(num)?0:mp.get(i).get(num); 
               int get=call(i+1,num,mp,m,n)+(n-cnt);
               dp[i][prev][num]=get;
               min=Math.min(get,min);
            }
        }


        return min;

    }



    public int minimumOperations(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        dp=new int[m][12][12];


        for(int i=0;i<m;i++){
            for(int j=0;j<12;j++){
                for(int k=0;k<12;k++){
                    dp[i][j][k]=-1;
                }
            }
        }

        HashMap<Integer,HashMap<Integer,Integer>> mp= new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!mp.containsKey(j)){ mp.put(j,new HashMap<>());}
                mp.get(j).put(grid[i][j],mp.get(j).getOrDefault(grid[i][j],0)+1);
            }
        } 



        return call(0,11,mp,m,n);


     


    }
}