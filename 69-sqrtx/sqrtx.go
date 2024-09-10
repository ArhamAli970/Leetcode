func mySqrt(x int) int {

    st:=1;
    ans:=0;
    end:=1000000;

    for st<=end{
        mid:=(st+end)/2;
        if mid*mid>x{
            end=mid-1;
        }else{
            ans=mid;
            st=mid+1;
        }
    }

    return ans;

}