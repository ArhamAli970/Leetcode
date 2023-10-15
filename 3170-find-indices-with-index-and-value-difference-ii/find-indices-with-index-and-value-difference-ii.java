class Solution {
    public int[] findIndices(int[] arr, int indexDifference, int valueDifference) {

int ans[]=new int[2];
int n=arr.length;


if( indexDifference==0 &&  valueDifference==0 && n>=1){
    return ans;
}

Arrays.fill(ans,-1);

int j=indexDifference,i=0, max=-1,min=Integer.MAX_VALUE,maxIdx=-1,minIdx=-1;

while(j<n){ 
    if(arr[i]>max){max=arr[i];maxIdx=i;}
    if(arr[i]<min){min=arr[i];minIdx=i;}
    
    if(Math.abs(arr[j]-max)>=valueDifference){ans[0]=maxIdx;ans[1]=j;break;}
    else if(Math.abs(arr[j]-min)>=valueDifference){ans[0]=minIdx;ans[1]=j;break;}
    i++;
    j++;
}


return ans;
        
    }
}