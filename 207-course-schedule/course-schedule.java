class Solution {
static boolean vis[];
public static boolean call(int i, ArrayList<Integer> arr[],HashSet<Integer> curr){
    if(vis[i]){return true;}
    vis[i]=true;
    curr.add(i);

    for(int j=0;j<arr[i].size();j++){
        int now=arr[i].get(j);
        if(curr.contains(now)){return false;}
        else if(!call(now,arr,curr)){
            return false;
        }
    }
    curr.remove(i);
    return true;
}

    public boolean canFinish(int numCourses, int[][] pre) {
        int n=numCourses;
        ArrayList<Integer> arr[]= new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<pre.length;i++){
            arr[pre[i][1]].add(pre[i][0]);
        }

         vis= new boolean[n];
         HashSet<Integer> curr= new HashSet<>();
     


        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(!call(i,arr,curr)){
                    return false;
                }
            }

        }

return true;
        
    

    }
}