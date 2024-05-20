class Solution {
    static int dp[][];


    public static int call(int i,int prev,HashMap<Integer,HashMap<Integer,Integer>> mp,int m,int n){

        if(i==m){
            return 0;
        }


if(dp[i][prev]!=-1){return dp[i][prev];}


        int min=1000000000;

        for(int num=0;num<=9;num++){
            if(num==prev){continue;}
            else{
               int cnt=!mp.get(i).containsKey(num)?0:mp.get(i).get(num); 
               int get=call(i+1,num,mp,m,n)+(n-cnt);
               min=Math.min(get,min);
            }
        }

        dp[i][prev]=min;


        return min;

    }



    public int minimumOperations(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        dp=new int[m][12];


        for(int i=0;i<m;i++){
            for(int j=0;j<12;j++){
                dp[i][j]=-1;
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