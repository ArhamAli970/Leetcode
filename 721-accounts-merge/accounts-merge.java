class Solution {
    static int par[];
    public static int getPar(int v){
        if(par[v]==v){return v;}
        return par[v]=getPar(par[v]);
    }
    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
         List<List<String>> ans =new ArrayList<>();
        
        int n=accounts.size();
        
        par=new int[n];
        int sz[]=new int[n];
        
        Arrays.fill(sz,1);
        for(int i=0;i<n;i++){par[i]=i;}
        
        HashMap<String,Integer> mp=new HashMap<>();
        
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String str=accounts.get(i).get(j);
                if(str.length()==0){continue;}
                
                
                if(mp.containsKey(str)){
                    
                    int curr=i;
                    int other=mp.get(str);
                    
                    int p1=getPar(curr);
                    int p2=getPar(other);
                    
                    if(sz[p1]>=sz[p2]){
                        sz[p1]+=sz[p2];
                        par[p2]=p1;
                    }else{
                        sz[p2]+=sz[p1];
                        par[p1]=p2;
                    }
                    
                    
                }else{
                    mp.put(str,i);
                }
                
            }
        }
        
        HashMap<Integer,TreeSet<String>> mp1=new HashMap<>();
        
        for(int i=0;i<n;i++){
           par[i]=getPar(par[i]);
           if(!mp1.containsKey(par[i])){
             mp1.put(par[i],new TreeSet<>());
           }

           for(int j=1;j<accounts.get(i).size();j++){
              if(accounts.get(i).get(j).length()!=0){
                mp1.get(par[i]).add(accounts.get(i).get(j));
              }
           }
        }

// System.out.print(mp1);
    


        for(Map.Entry<Integer,TreeSet<String>> e:mp1.entrySet()){
            ans.add(new ArrayList<>());
            int p=e.getKey();
            ans.get(ans.size()-1).add(accounts.get(p).get(0));
            for(String i:e.getValue()){
                ans.get(ans.size()-1).add(i);
            }
        }

    return ans;
                
    }
}