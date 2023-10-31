class Solution {

static class node { 
    int i;
    int j;
    node(int i,int j){ 
        this.i=i;
        this.j=j;
    }
}    


public static void dfs1(int i,int j,int mat[][],Queue<node> q,boolean vis[][]){ 
    if(i<0|| j<0|| i==mat.length || j==mat[0].length || mat[i][j]==0 || vis[i][j]){ 
return;
    }

    vis[i][j]=true;
q.add(new node(i, j));
dfs1(i+1,j,mat,q,vis);  
dfs1(i,j-1,mat,q,vis);  
dfs1(i-1,j,mat,q,vis);  
dfs1(i,j+1,mat,q,vis);  


}


    public int shortestBridge(int[][] mat) {
        Queue<node> q= new LinkedList<>();


   int n=mat.length;
   boolean vis[][]= new boolean[n][n];
boolean dfs=true;
   for(int i=0;i<n;i++){ 
    for (int j=0;j<n;j++){ 
        if(mat[i][j]==1){ 
            dfs1(i,j,mat,q,vis);   
            dfs=false;
            break;

        }
      
    }
    if(!dfs){break;}
   }



//    for(int i=0;i<n;i++){ 
//     for (int j=0;j<n;j++){ 
       
//       System.out.print(vis[i][j]);
//     }
//  System.out.println();
//    }



int step=0;
boolean stp=false;

   while(!q.isEmpty()){ 

    int size=q.size();

    for (int k=0;k<size;k++){ 

node curr= q.remove();  
int i=curr.i;
int j=curr.j;

if(mat[i][j]==1 && !vis[i][j]){ 
   return step-1;
   
}

if(i-1>=0 && !vis[i-1][j] ){ 
    q.add(new node(i-1, j)); 
   if(mat[i-1][j]!=1) vis[i-1][j]=true;
}
if(j-1>=0 && !vis[i][j-1]){ 
    q.add(new node(i, j-1));
    if(mat[i][j-1]!=1)  vis[i][j-1]=true;
    
}
if(i+1<n && !vis[i+1][j] ){ 
    q.add(new node(i+1, j));
    if(mat[i+1][j]!=1)  vis[i+1][j]=true;
}
if(j+1<n && !vis[i][j+1]){ 
    q.add(new node(i, j+1));
    if(mat[i][j+1]!=1)  vis[i][j+1]=true;
}



    } 
 
   
    step++;

   }



return -1;
    }
}