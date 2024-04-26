class Solution {
    static class node{
        int i,j;
        node(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    static int arr[][]={{0,1},{0,-1},{-1,0},{1,0}};
    public static boolean chk(int row,int col,int[][] cells,int mid){
        int mat[][]=new int[row][col];

        for(int i=0;i<=mid;i++){
            mat[cells[i][0]-1][cells[i][1]-1]=-1;
                    // System.out.print(cells[i][0]+" "+cells[i][1]);

        }

        Queue<node> q= new LinkedList<>();
        for(int j=0;j<col;j++){
            if(mat[0][j]!=-1){q.add(new node(0,j));}
            mat[0][j]=-1;
        }

        // System.out.println(q.size()+" "+mid);

        while(!q.isEmpty()){
            node curr=q.remove();
            int i=curr.i,j=curr.j;
            for(int k=0;k<4;k++){
                if(j+arr[k][1]>=0 && j+arr[k][1]<col && i+arr[k][0]>=0  &&  mat[i+arr[k][0]][j+arr[k][1]]!=-1){
                    if(i+arr[k][0]==row-1){return true;}
                    q.add(new node(i+arr[k][0],j+arr[k][1]));
                    mat[i+arr[k][0]][j+arr[k][1]]=-1;
                }
            }
        }


        return false;



    }

    public int latestDayToCross(int row, int col, int[][] cells) {
        int n=cells.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(chk(row,col,cells,mid)){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return ans;
    }
}