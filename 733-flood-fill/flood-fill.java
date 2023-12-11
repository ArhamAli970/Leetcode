class Solution {

static class node{ 
    int i,j;
    node(int i, int j){this.i=i;this.j=j;}
}

public int[][] floodFill(int[][] image, int sr, int sc, int color) {

boolean mark[][]=new  boolean[image.length][image[0].length];
Queue<node> q= new LinkedList<>();
int st=image[sr][sc];
q.add(new node(sr,sc));

   while(!q.isEmpty()){ 

    node curr=q.remove();
int i=curr.i,j=curr.j;
    image[i][j]=color;
    mark[i][j]=true;

    if(i-1>=0 && image[i-1][j]==st && !mark[i-1][j]){q.add(new node(i-1,j));}
    if(i+1<image.length && image[i+1][j]==st &&  !mark[i+1][j]){q.add(new node(i+1,j));}
    if(j-1>=0 && image[i][j-1]==st &&  !mark[i][j-1]){q.add(new node(i,j-1));}
    if(j+1<image[0].length && image[i][j+1]==st  && !mark[i][j+1]){q.add(new node(i,j+1));}
    

   }

return image;

    }
}