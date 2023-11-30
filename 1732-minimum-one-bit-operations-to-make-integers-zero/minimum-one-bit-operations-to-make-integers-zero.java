class Solution {
    public int minimumOneBitOperations(int n) {
        return minOperations(n);
    }

    private int minOperations(int n) {
        if (n == 0) {
            return 0;
        }

        int msb = 31 - Integer.numberOfLeadingZeros(n); // Find the most significant bit

        return (1 << (msb + 1)) - 1 - minOperations(n ^ (1 << msb));
    }
}