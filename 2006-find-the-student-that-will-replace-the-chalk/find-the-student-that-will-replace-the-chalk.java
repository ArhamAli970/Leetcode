class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i:chalk){sum+=i;}
        long rem=k%sum;
        int studentNum=0;
        while(rem-chalk[studentNum]>=0){
            rem-=chalk[studentNum];
            studentNum++;
        }

        return studentNum;

    }
}