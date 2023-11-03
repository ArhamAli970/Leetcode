class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l= new ArrayList<>();
        int idx=0,i=1;
         
        while(idx<target.length){ 
            while(i!=target[idx]){ 
                l.add("Push");l.add("Pop");
                  i++;
            }
            l.add("Push");
            i++;idx++;
        }
        return l;
    }
}