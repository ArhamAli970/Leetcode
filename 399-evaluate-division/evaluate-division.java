class Solution {
        static HashMap<String,HashMap<String,Double>> mp;

    
    public static double callDfs(String curr,String want,HashSet<String> h1){
        if(curr.equals(want)){
             return 1.0;
        }
        h1.add(curr);

        HashMap<String,Double> m1= mp.get(curr);
        // System.out.print(m1);

        for(Map.Entry<String,Double> e: m1.entrySet()){
            if(!h1.contains(e.getKey())){
                double ans=callDfs(e.getKey(),want,h1);
                if(ans<0){continue;}
                
                return ans*e.getValue();
            }
        }

        

        return -1.0;



         

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    
    HashSet<String> h=new HashSet<>();
    int n=equations.size();
    int m=queries.size();
    double ans[]= new double[m];

    mp= new HashMap<>();



        for(int i=0;i<n;i++){
            String var1= equations.get(i).get(0);
            String var2= equations.get(i).get(1);
             if(!mp.containsKey(var1)){
                 mp.put(var1,new HashMap<>());
             }
             if(!mp.containsKey(var2)){
                 mp.put(var2,new HashMap<>());
             }

             mp.get(var1).put(var2,values[i]);
             mp.get(var2).put(var1,1.0/values[i]);
             h.add(var1);
             h.add(var2);
        } 

// System.out.print();

        for(int i=0;i<m;i++){
            String var1= queries.get(i).get(0);
            String var2= queries.get(i).get(1);
            if(!(h.contains(var1) && h.contains(var2))){
                ans[i]=-1.0;
                continue;
            }
            HashSet<String> h1= new HashSet<>();
            ans[i]= callDfs(var1,var2,h1);


        }
return ans;
    }
}