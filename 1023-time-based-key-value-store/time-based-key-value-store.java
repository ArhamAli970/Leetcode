class TimeMap {
static HashMap<String,ArrayList<ArrayList<String>>> mp;
    public TimeMap() {
        mp= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
       if(!mp.containsKey(key)){
        mp.put(key,new ArrayList<>());
    }
    ArrayList<String> ans=new ArrayList<>();
    ans.add(value);
    ans.add(String.valueOf(timestamp));
    mp.get(key).add(ans);
    
    }
    
    public String get(String key, int timestamp) {
        if(!mp.containsKey(key) || Integer.parseInt(mp.get(key).get(0).get(1))>timestamp){return "";} 
        ArrayList<ArrayList<String>> arr=mp.get(key);
        int st=0,end=arr.size()-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(Integer.parseInt(arr.get(mid).get(1))<=timestamp){ans=mid;st=mid+1;}
            else{end=mid-1;}
        }

        return arr.get(ans).get(0);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */