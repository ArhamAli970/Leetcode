class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int coins=0,i=0,j=piles.length-1;
        while(i<j){ 
            i++;
            j--;
            coins+=piles[j--];

        }

        return coins;
    }
}