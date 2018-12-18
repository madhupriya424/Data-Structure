/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)==true)
                end = mid-1;
            else
                start = mid+1;
        }
        return start;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 
