class Solution {
    public int maxDistance(List<List<Integer>> arr) {

    int max[][]=new int[2][2];
    int n=arr.size();
    max[0][1]=Integer.MIN_VALUE;max[1][1]=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        int sz=arr.get(i).size();
        int ele=arr.get(i).get(sz-1);
        if(ele>max[0][1]){
            max[1][1]=max[0][1];
            max[1][0]=max[0][0];
            max[0][1]=ele;
            max[0][0]=i;
        }
        else if(ele>max[1][1]){
            max[1][1]=ele;
            max[1][0]=i;
        }
    }

    int min[][]=new int[2][2];
     min[0][1]=Integer.MAX_VALUE;min[1][1]=Integer.MAX_VALUE;

      for(int i=0;i<n;i++){
        // int sz=arr.get(i).size();
        int ele=arr.get(i).get(0);
        if(ele<min[0][1]){
            min[1][1]=min[0][1];
            min[1][0]=min[0][0];
            min[0][1]=ele;
            min[0][0]=i;
        }
        else if(ele<min[1][1]){
            min[1][1]=ele;
            min[1][0]=i;;
        }
    }


// for(int i=0;i<2;i++){
//     System.out.print(max[i][1]+" "+min[i][1]);
// }


int diff=0;

for(int i=0;i<2;i++){
    int mn=min[i][1],idx=min[i][0];
    for(int j=0;j<2;j++){
        if(idx==max[j][0]){continue;}
        diff=Math.max(diff,Math.abs(max[j][1]-mn));
    }
}

return diff;

        
    }
}