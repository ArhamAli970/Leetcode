class Solution {
    static int n;

    public static int Inc(int i,int j,int nums[]){

        ArrayList<Integer> arr=new ArrayList<>();
        int md=nums[j+1];
        int cnt=0;

        for(int k=i;k<=j;k++){
            if(nums[k]>=md){cnt++;}
            else if(arr.size()==0  || arr.get(arr.size()-1)<nums[k]){arr.add(nums[k]);}
            else{
                int st=0,end=arr.size()-1,idx=-1;
                while(st<=end){
                    int mid=(st+end)/2;
                    if(arr.get(mid)<nums[k]){st=mid+1;}
                    else if(arr.get(mid)>=nums[k]){idx=mid;end=mid-1;}
                }
                arr.set(idx,nums[k]);
                cnt++;
            }
        }

        return cnt;


    }

      public static int Dec(int i,int j,int nums[]){

        ArrayList<Integer> arr=new ArrayList<>();
        int md=nums[j-1];
        int cnt=0;

        for(int k=i;k>=j;k--){
            if(nums[k]>=md){cnt++;}
            else if(arr.size()==0  || arr.get(arr.size()-1)<nums[k]){arr.add(nums[k]);}
            else{
                int st=0,end=arr.size()-1,idx=-1;
                while(st<=end){
                    int mid=(st+end)/2;
                    if(arr.get(mid)<nums[k]){st=mid+1;}
                    else if(arr.get(mid)>=nums[k]){idx=mid;end=mid-1;}
                }
                arr.set(idx,nums[k]);
                cnt++;
            }
        }

        return cnt;


    }

    public int minimumMountainRemovals(int[] nums) {
        n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            int c1=Inc(0,i-1,nums);
            int c2=Dec(n-1,i+1,nums);

            if(i-c1==0 || n-1-i-c2==0){continue;}

            min=Math.min(c1+c2,min);
        }

        return min;

    }
}