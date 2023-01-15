class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;

        //int[] arr = {2,4,5,6,6,7,8,9,9,10,24,12,10,8,4,2};

        while(start<end)
        {
            if(arr[mid]>arr[mid+1])
                end = mid;
            else if(arr[mid]<arr[mid+1])
                start = mid + 1;
            
            mid = start + (end-start)/2;
        }

        return mid;
    }
}