class Solution {
static ArrayList<ArrayList<Integer>> ans;

public static void call(int i, int j,int land[][]){
    if(i<0 || j<0 || i==land.length || j==land[0].length || land[i][j]==0 || land[i][j]==-1){
        return;
    }
    land[i][j]=-1;
    if((i+1==land.length || land[i+1][j]==0) && (j+1==land[0].length || land[i][j+1]==0)){
        ans.get(ans.size()-1).add(i);
        ans.get(ans.size()-1).add(j);return;
    }
    
    call(i,j+1,land);
    call(i+1,j,land);


}

    public int[][] findFarmland(int[][] land) {
        ans=new ArrayList<>();
        int n=land.length,m=land[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j]==1 ){
                    ans.add(new ArrayList<>());
                    ans.get(ans.size()-1).add(i);
                    ans.get(ans.size()-1).add(j);
                    call(i,j,land);
                }
            }
        }

    // System.out.print(ans);    

int arr[][]= new int[ans.size()][4];

for(int i=0;i<ans.size();i++){
    arr[i][0]=ans.get(i).get(0);
    arr[i][1]=ans.get(i).get(1);
    arr[i][2]=ans.get(i).get(2);
    arr[i][3]=ans.get(i).get(3);


}

return arr;

    }
}