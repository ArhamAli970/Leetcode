class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length,i=0,j=skill.length-1,sum=skill[i]+skill[j];
        long ans=0;
        while(i<j){
            if(skill[i]+skill[j]!=sum){return -1l;}
            long mul=skill[i]*skill[j];
            ans+=mul;
            i++;j--;
        }

        return ans;

    }
}