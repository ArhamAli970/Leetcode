class Solution {
    static class  node{
        int i,j;
        node(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    static int n,m;
    
    public static boolean check(int i,int j,int ent[]){
        
        if(i==ent[0] && j==ent[1]){return false;}
        
        return i==n-1 || i==0 || j==m-1 || j==0;
        
    }
    
    public int nearestExit(char[][] maze, int[] entrance) {
        
           Queue<node> q=new LinkedList<>();
           q.add(new node(entrance[0],entrance[1]));
        
         n=maze.length;m=maze[0].length;
        
          int cnt=0;
         int arr[][]={{1,0},{-1,0},{0,1},{0,-1}}; 
        
           while(!q.isEmpty()){
               int sz=q.size();
               for(int l=0;l<sz;l++){
                   
                   node curr=q.remove();
                   int i=curr.i,j=curr.j;
                   
                   if(check(i,j,entrance)){return cnt;}
                   
                   for(int k=0;k<4;k++){
                       int x1=arr[k][0],y1=arr[k][1];
                       if(i+x1>=n || i+x1<0 || j+y1<0 || j+y1>=m || maze[i+x1][j+y1]=='+'){continue;}
                       
                       q.add(new node(i+x1,j+y1));
                       maze[i+x1][j+y1]='+';
                       
                   }
                   
               }
               
               cnt++;
           }
        
        return -1;
        
    }
}