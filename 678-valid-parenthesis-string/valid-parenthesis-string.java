class Solution {
    static HashMap<Integer,HashMap<Integer,Boolean>> mp;

public static boolean call(int i,int bal,String s){
    if(i==s.length()){return bal==0;}
    if(bal<0){return false;}

    if(!mp.containsKey(i)){mp.put(i,new HashMap<>());}
    if(mp.get(i).containsKey(bal)){return mp.get(i).get(bal);}

boolean val=false;
    if(s.charAt(i)==')'){
         val=call(i+1,bal-1,s);
    }
    else if(s.charAt(i)=='('){
         val=call(i+1,bal+1,s);


    }else{

        val=call(i+1,bal-1,s) || call(i+1,bal+1,s) || call(i+1,bal,s);

    }

    mp.get(i).put(bal,val);

    return val;

}

    public boolean checkValidString(String s) {

    

        mp= new HashMap<>();

        return call(0,0,s);



    }
}