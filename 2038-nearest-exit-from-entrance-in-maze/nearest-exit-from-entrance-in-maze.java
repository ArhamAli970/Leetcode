class Solution {
    static class node{
        int x,y;
        node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
                int n=maze.length,m=maze[0].length;
        Queue<node> q= new LinkedList<>();
        int arr[][]={{0,1},{1,0},{0,-1},{-1,0}};

        boolean chk[][]=new boolean[n][m]; 


        q.add(new node(entrance[0],entrance[1]));
        chk[entrance[0]][entrance[1]]=true;
        int cnt=0;

        while(!q.isEmpty()){

            int size=q.size();

            for(int k=0;k<size;k++){
                node curr=q.remove();
                int x=curr.x,y=curr.y;
                
                if(x==0 || y==0 || x==n-1 || y==m-1){
                    if(x!=entrance[0] || y!=entrance[1]){
                    return cnt;
                    }
                }

                for(int i=0;i<4;i++){
                    if(x+arr[i][0]<0 || x+arr[i][0]>=n || y+arr[i][1]<0 || y+arr[i][1]>=m ){continue;}
                    if( maze[x+arr[i][0]][y+arr[i][1]]!='+'  && !chk[x+arr[i][0]][y+arr[i][1]]){
                        chk[x+arr[i][0]][y+arr[i][1]]=true;
                        q.add(new node(x+arr[i][0],y+arr[i][1]));
                    }
                }




            }


cnt++;
        }


        return -1;



    }
}