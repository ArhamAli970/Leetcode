class Solution {
    static int par[];
    public static int fnd(int x){
        if(par[x]==-1) return x;

        return fnd(par[x]);      
    }
    public int minimumHammingDistance(int[] src, int[] target, int[][] swp) {
        int n=src.length;
        par=new int[n];

        Arrays.fill(par,-1);

        for(int i[]:swp){
           int par1=fnd(i[0]);
           int par2=fnd(i[1]);

           if(par1!=par2){
               par[par1]=par2;
           }

        }

// sabse bada parent  -> ( element , freq)

        HashMap<Integer,HashMap<Integer,Integer>> mp= new HashMap<>();

        for(int i=0;i<n;i++){
            int sc=fnd(i);

            if(!mp.containsKey(sc)){mp.put(sc,new HashMap<>());}

            HashMap<Integer,Integer> m1=mp.get(sc);

            m1.put(src[i],m1.getOrDefault(src[i],0)+1);
        }

int ham=0;
        for(int i=0;i<n;i++){
            int p1=fnd(i);

            if(mp.get(p1).containsKey(target[i])){
                HashMap<Integer,Integer> m1=mp.get(p1);
                m1.put(target[i],m1.get(target[i])-1);
                if(m1.get(target[i])==0){m1.remove(target[i]);}
            }else{
                ham++;
            }
             
        }


return ham;


    }
}