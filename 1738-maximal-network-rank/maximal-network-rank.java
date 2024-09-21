class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        HashSet<Integer> arr[]=new HashSet[n];

        for(int i=0;i<n;i++){
            arr[i]=new HashSet<>();
        }

        for(int i[]: roads){
            arr[i[0]].add(i[1]);
            arr[i[1]].add(i[0]);
        }

        // System.out.print(arr);

        int max=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            
                // System.out.println(arr[i]+" "+arr[j]);
                int tot=arr[i].size()+arr[j].size();
                if(arr[i].contains(j)){
                    tot--;
                }
                max=Math.max(tot,max);
            }
        }

        return max;

    }
}