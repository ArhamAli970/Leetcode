class Solution {

  static List<String> l;

    public static boolean dfs(String st,int e,  HashMap<String,ArrayList<ArrayList<String>>> tp){
        //base case


        if(e==0){return true;}
        // System.out.println(tp);
        ArrayList<ArrayList<String>> t= tp.get(st);
        if(t!=null){
        for(int i=0;i<t.size();i++){ 
          if(t.get(i).get(1).equals("-1")){
            tp.get(st).get(i).set(1, "0");
            if(dfs(t.get(i).get(0), e-1, tp)){ 
              l.add(0, t.get(i).get(0));
              return true;
            }
          tp.get(st).get(i).set(1, "-1");  
        }

            //  l.remove(l.size()-1);

        }
        }

        return false;


    }

    public List<String> findItinerary(List<List<String>> tickets) {
        
  l= new LinkedList<>();
  int n=tickets.size();
  // HashMap<String,Integer> mp= new HashMap<>();

  HashMap<String,ArrayList<ArrayList<String>>> tp= new HashMap<>();
ArrayList <String> a= new ArrayList<>();
  for(int i=0;i<n;i++){ 
   
    if(!tp.containsKey(tickets.get(i).get(0))){ 
        tp.put(tickets.get(i).get(0), new ArrayList<>());
    }
    a=new ArrayList<>();
  a.add(tickets.get(i).get(1));
  a.add("-1");
  tp.get(tickets.get(i).get(0)).add(a);

  }
  
  for(Map.Entry<String,ArrayList<ArrayList<String>>> e: tp.entrySet()){ 
    ArrayList<ArrayList<String>> arr= e.getValue();
    Collections.sort(arr,(k,p)-> k.get(0).compareTo(p.get(0)));
    tp.put(e.getKey(), arr);
  }

  
//  System.out.println(tp);
 
  String st="JFK";
  


  dfs(st,n,tp);
  l.add(0,st);
  return l;
    }
}