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
        int peak = findPeakIndexInMountainArray(mountainArr);

        int leftSearch = orderAgnosticBinarySearch(target,mountainArr,0,peak);
        int rightSearch = orderAgnosticBinarySearch(target,mountainArr,peak,mountainArr.length()-1);

        if(leftSearch == -1 && rightSearch == -1)
            return -1;
        else if(leftSearch != -1)
            return leftSearch;
        else
            return rightSearch;

    }

    public int orderAgnosticBinarySearch(int target,MountainArray mountainArr,int start, int end)
    {
        boolean ascendingCheck = mountainArr.get(start)<mountainArr.get(end);
        int mid = start + (end-start)/2;

        while(start<=end)
        {
            if(target<mountainArr.get(mid))
            {
                if(ascendingCheck)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if(target>mountainArr.get(mid))
            {
                if(ascendingCheck)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else
                return mid;
            mid = start + (end-start)/2;
        }
        return -1;
    }

    public int findPeakIndexInMountainArray(MountainArray mountainArr)
    {
        int start = 0;
        int end = mountainArr.length()-1;
        int mid = start + (end-start)/2;

        while(start<end)
        {
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
                start = mid + 1;
            else
                end = mid;
            mid = start + (end-start)/2;
        }

        return mid;
    }
}