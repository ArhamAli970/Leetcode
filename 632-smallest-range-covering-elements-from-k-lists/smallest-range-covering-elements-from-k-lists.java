class Solution {

    public int[] smallestRange(List<List<Integer>> nums) {


int cnt=0;
for(int i=0;i<nums.size();i++){ 
     cnt+=nums.get(i).size();
}

int arr[][]= new int[cnt][2];

cnt=0;
for(int i=0;i<nums.size();i++){ 
    for(int j=0;j<nums.get(i).size();j++){ 
        arr[cnt][0]=nums.get(i).get(j);
        arr[cnt++][1]=i;
    }
}

Arrays.sort(arr,(a,b)->{ 
     if(a[0]!=b[0]){return a[0]-b[0];}
     return a[1]-b[1];

});


int cntRng=nums.size();



HashMap<Integer,Integer> mp= new HashMap<>();
int ans[]= new int[2];
ans[0]=1;ans[1]=1;
int rng=Integer.MAX_VALUE;

int i=0,j=0,size=arr.length;

while(j<size){

    while(j<size && mp.size()<cntRng){ 
        mp.put(arr[j][1],mp.getOrDefault(arr[j][1],0)+1);
        j++;
    }

    // System.out.print(j+" ");
    if(mp.size()==cntRng){j--;}

if(j>=size){break;}

    while(i<j && mp.size()>=cntRng){ 
        if(arr[j][0]-arr[i][0]<rng && arr[j][1]!=arr[i][1]){
            rng=arr[j][0]-arr[i][0];
            ans[0]=arr[i][0];ans[1]=arr[j][0];
        }
        int val=mp.get(arr[i][1]);
        mp.put(arr[i][1],val-1);
        if(mp.get(arr[i][1])==0){mp.remove(arr[i][1]);}
        i++;
    }

j++;


}


return ans;


    }
}