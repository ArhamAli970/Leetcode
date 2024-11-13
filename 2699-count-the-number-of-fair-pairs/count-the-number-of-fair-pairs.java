class Solution {

    public static int lft(int arr[],int lft,int rht,int s){
        int st=s+1,end=arr.length-1,ans=-1,curr=arr[s];
        while(st<=end){
            int md=(st+end)/2;
            if(arr[md]+curr>=lft && arr[md]+curr<=rht){ans=md;end=md-1;}
            else if(arr[md]+curr>rht){end=md-1;}
            else{st=md+1;}

        }

        return ans;
    }


    public static int rht(int arr[],int lft,int rht,int s){
        int st=s,end=arr.length-1,ans=-1,curr=arr[s];
        while(st<=end){
            int md=(st+end)/2;
            if(arr[md]+curr>=lft && arr[md]+curr<=rht){ans=md;st=md+1;}
            else if(arr[md]+curr>rht){end=md-1;}
            else{st=md+1;}

        }

        return ans;
    }
   

    public long countFairPairs(int[] nums, int lower, int upper) {

        long ans=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int lft=lft(nums,lower,upper,i);
            int rht=rht(nums,lower,upper,i);

            if(lft==-1){continue;}

            ans+=rht-lft+1;

        }

        return ans;
        
    }
}