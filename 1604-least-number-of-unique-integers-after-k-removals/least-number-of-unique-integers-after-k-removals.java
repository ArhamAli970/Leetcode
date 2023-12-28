class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<arr.length;i++){ 
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
            pq.add(e.getValue());
        }

int size=mp.size();

        while(!pq.isEmpty() && k>=pq.peek()){ 
            k-=pq.remove();
            size--;
        }

        return size;

    }
}