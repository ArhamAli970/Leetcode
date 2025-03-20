class Solution {
    static ArrayList<int[]> arr[];
    static int And;
    static HashMap<Integer,Integer> mp;
    public static void call(int vis[],int i,int grp){
        if(vis[i]!=0){return;}
        vis[i]=grp;
        
        for(int j=0;j<arr[i].size();j++){
            int[] curr=arr[i].get(j);
            And=(And&arr[i].get(j)[1]);
            call(vis,arr[i].get(j)[0],grp);
        }
    }
    public int[] minimumCost(int n, int[][] edges, int[][] query) {

        arr=new ArrayList[n];
        mp=new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i[]:edges){
            arr[i[0]].add(new int[]{i[1],i[2]});
            arr[i[1]].add(new int[]{i[0],i[2]});
        }

        int vis[]=new int[n];
        int grp=1;

        for(int i=0;i<n;i++){
            if(arr[i].size()==0){
              vis[i]=grp;
            }else{
              And=arr[i].get(0)[1];
              call(vis,i,grp);
              mp.put(grp,And);
            }
            grp++;
        }

        int ans[]=new int[query.length];

        for(int i=0;i<ans.length;i++){
            if(vis[query[i][0]]!=vis[query[i][1]]){
                ans[i]=-1;
            }else{
                ans[i]=mp.get(vis[query[i][0]]);
            }
        }


        return ans;


        
    }
}