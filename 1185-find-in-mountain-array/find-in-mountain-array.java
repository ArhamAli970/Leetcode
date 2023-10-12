/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        // get the mountain array peek element index
        int n=mountainArr.length();

        int st=1,end=n-2,idx=-1;

        while(st<=end){ 

            int mid=(st+end)/2;
            int m=mountainArr.get(mid);
            int left=mountainArr.get(mid-1);
            int right=mountainArr.get(mid+1);

            if(m>left && m>right){
                idx=mid;break;
            }

            else if(m>right){ 
                end=mid-1;
            }
            else{ 
               st=mid+1;
            }

        }

    if(mountainArr.get(idx)==target){return idx;}

    st=0;end=idx-1;
    int in=-1;

    while(st<=end){ 
        int mid=(st+end)/2;
        int val=mountainArr.get(mid);
        if(val>target){ 
            end=mid-1;
        }
        else if(val<target){ 
            st=mid+1;
        } 
        else{ 
            in=mid;break;
        }

    }

    if(in!=-1){return in;}

st=idx+1;end=n-1;
    
    while(st<=end){ 
        int mid=(st+end)/2;
        int val=mountainArr.get(mid);
        if(val>target){ 
            st=mid+1;
        }
        else if(val<target){ 
            end=mid-1;
        } 
        else{ 
            in=mid;break;
        }

    }


return in;






        
    }
}