class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> mp= new HashMap<>();
       StringBuilder ans= new StringBuilder();

       int n=s.length();

       for(int i=0;i<n;i++){
           mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
       }

       TreeMap<Integer,ArrayList<Character>> freq= new TreeMap<>(Collections.reverseOrder());

       for(Map.Entry<Character,Integer> e: mp.entrySet()){ 
           int frq=e.getValue();
           char ch=e.getKey();
            if(!freq.containsKey(frq)){
                freq.put(frq,new ArrayList<>());
            }
            freq.get(frq).add(ch);
       }

    //    System.out.print(freq);

       for(Map.Entry<Integer,ArrayList<Character>> e: freq.entrySet()){
            ArrayList<Character> arr= e.getValue();
             for(char i : arr){
                 int cnt=e.getKey();
                 while(cnt>0){ans.append(i);cnt--;}
             } 
       }

       return ans.toString();

    }
}