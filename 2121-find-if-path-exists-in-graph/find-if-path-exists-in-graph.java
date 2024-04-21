class Solution {

public static boolean checkpath(int src,int dest,boolean vis[], ArrayList<ArrayList<Integer>> arr){ 

    if(src==dest){ 
        return true;
    }

vis[src]=true;

for(int i=0;i<arr.get(src).size();i++){ 
    if(!vis[arr.get(src).get(i)]){ 

if(checkpath(arr.get(src).get(i),dest,vis,arr)){ 
    return true;
}

    }
}

return false;
}

    public boolean validPath(int n, int[][] edges, int src, int dest) {

        ArrayList<ArrayList<Integer>> arr= new ArrayList<>(); 

        for(int i=0;i<n;i++){ 
            arr.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){ 
     arr.get(edges[i][0]).add(edges[i][1]);
     arr.get(edges[i][1]).add(edges[i][0]);
        }

boolean vis[]=new boolean[n];
return checkpath(src,dest,vis,arr);

        
    }
}