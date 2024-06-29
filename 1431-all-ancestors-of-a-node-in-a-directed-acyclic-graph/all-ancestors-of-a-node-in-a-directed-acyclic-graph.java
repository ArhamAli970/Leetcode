class Solution {
    static ArrayList<Integer> arr[];
    static List<HashSet<Integer>> ans;
    static boolean vis[];

public static HashSet<Integer> call(int i,HashSet<Integer> h){
    if(vis[i]){return ans.get(i);}
    vis[i]=true;
   
    for(int j=0;j<arr[i].size();j++){
        h.add(arr[i].get(j));
        h.addAll(call(arr[i].get(j),new HashSet<>()));
    }

    ans.get(i).addAll(h);

    return ans.get(i);
    
}

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ans=new ArrayList<>();
        List<List<Integer>> a= new ArrayList<>();

        for(int i=0;i<n;i++){
            ans.add(new HashSet<>());
        }

        arr=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        // int deg[]=new int[n];

        for(int i=0;i<edges.length;i++){
            arr[edges[i][1]].add(edges[i][0]);
           

        }


vis=new boolean[n];
        
        for(int i=0;i<n;i++){
                ans.get(i).addAll(call(i,new HashSet<>()));
        }


        for(int i=0;i<ans.size();i++){
            a.add(new ArrayList<>(ans.get(i)));
        }

        for(int i=0;i<a.size();i++){
            Collections.sort(a.get(i));
        }

        return a;



        

    


    }
}