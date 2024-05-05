class Solution {
    
    public static int gcd(int num1,int num2){
        int m=Math.min(num1,num2);
        for(int i=m;i>0;i--){
            if(num1%i==0 && num2%i==0){return i;}
        }
        return -1;
    }
    
    
    public int minAnagramLength(String s) {
        
        HashMap<Character,Integer> mp= new HashMap<>();
        // int min=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        
        int min=1;
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            min=e.getValue();break;
        }
        
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            min=gcd(e.getValue(),min);
        }
        
        int cnt=0;
        
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            if(e.getValue()%min!=0){return s.length();}
            cnt+= (e.getValue()/min);
        }
        
        return cnt;
        
    }
}