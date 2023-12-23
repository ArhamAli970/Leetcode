class Solution {
    public boolean isPathCrossing(String path) {
        
        HashMap<Integer,HashSet<Integer>> mp= new HashMap<>();
        int x=0,y=0;
        mp.put(x,new HashSet<>());
        mp.get(x).add(y);

        for(int i=0;i<path.length();i++){ 
            if(path.charAt(i)=='N'){++y;}
            else if(path.charAt(i)=='S'){--y;}
            else if(path.charAt(i)=='E'){++x;}
            else{--x;}

            if(!mp.containsKey(x)){
                mp.put(x,new HashSet<>());
            }

            if(mp.get(x).contains(y)){
                return true;
            }
            else{
                mp.get(x).add(y);
            }

        }

        return false;

    }
}