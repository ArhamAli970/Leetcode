class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l= new ArrayList<>();
        rowIndex++;
        List <Integer> arr= new ArrayList<>();
arr.add(1);
l.add(arr);
if(   rowIndex==1){return arr;}  
arr= new ArrayList<>();
arr.add(1);
arr.add(1);
l.add(arr);
if(   rowIndex==2){return l.get(l.size()-1);} 
arr= new ArrayList<>();

for(int i=3;i<=   rowIndex;i++){ 
arr.add(1);
    for (int j=0;j<l.get(i-2).size()-1;j++){ 
        arr.add(l.get(i-2).get(j)+l.get(i-2).get(j+1));
    }
    arr.add(1);
    
l.add(arr);
arr= new ArrayList<>();
}
return l.get(l.size()-1);

    }
}