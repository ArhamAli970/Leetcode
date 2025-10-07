class Solution {
    public int[] avoidFlood(int[] rains) {

      // empty 
      // already full then flood 
      //  rains[i] >0

      // ans==rains.lent
      // ans[i]==-1 rains[i]>0
      // rains[i]==0
      // 2 1 
      // 2 3 

    //   1 2 0 1 2 0 3
    //    1->[5],2->[4],
    //3 <1,2>
    //4 <4->2,5->1>
    
    int n=rains.length;
    int ans[]=new int[n];
    HashMap<Integer,Queue<Integer>> mp=new HashMap<>();

    for(int i=0;i<n;i++){
        if(rains[i]>0){
           if(!mp.containsKey(rains[i])){mp.put(rains[i],new LinkedList<>());}
           mp.get(rains[i]).add(i);
        }
    }
// 1 ->5
// 2-> 1 4
// 1 2 
// 4->2 5->1

    HashSet<Integer> h=new HashSet<>();
    TreeMap<Integer,Integer> m1=new TreeMap<>();
    for(int i=0;i<n;i++){
        if(h.contains(rains[i])){return new int[0];}
        if(rains[i]>0){
            h.add(rains[i]);
            mp.get(rains[i]).remove();
            if(mp.get(rains[i]).size()>0){m1.put(mp.get(rains[i]).peek(),rains[i]);}
            ans[i]=-1;
        }else{
            if(m1.isEmpty()){ans[i]=1;continue;}
            int lp=m1.get(m1.firstKey());
            ans[i]=lp;
            m1.remove(m1.firstKey());
            h.remove(lp);
        }
    }

    return ans;



    }
}