class Solution {
static int par[];
    public static  int getPar(int v){
        if(par[v]==v){return v;}
        return par[v]=getPar(par[v]);
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int sz[]=new int[n];
        par=new int[n];
        Arrays.fill(sz,1);
        for(int i=0;i<n;i++){
            par[i]=i;
        }
        

        for(int i=0;i<pairs.size();i++){
            int p1=getPar(pairs.get(i).get(0));
            int p2=getPar(pairs.get(i).get(1));

            if(p1==p2){continue;}

            if(sz[p1]>sz[p2]){
                sz[p1]+=sz[p2];
                par[p2]=p1;
            }else{
                sz[p2]+=sz[p1];
                par[p1]=p2;
            }

        }

        HashMap<Integer,PriorityQueue<Character>> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            int papa=getPar(i);
            if(!mp.containsKey(papa)){
                mp.put(papa,new PriorityQueue<>());
            }
            mp.get(papa).add(s.charAt(i));
        }

        for(int i=0;i<n;i++){
            char ch=mp.get(par[i]).remove();
            sb.append(ch);
        }


return sb.toString();
        

    }
}