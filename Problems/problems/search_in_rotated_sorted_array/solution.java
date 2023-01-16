class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot==-1)
            return binarySearch(nums,target,0,nums.length-1);

        if(nums[pivot]==target)
            return pivot;
        
        if(target>=nums[0])
            return binarySearch(nums,target,0,pivot-1);
        else
            return binarySearch(nums,target,pivot+1,nums.length-1);
        
    }

    public int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;

        while(start<end)
        {
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            else if(mid>start && nums[mid]<nums[mid-1])
                return mid - 1;

            if(nums[start]>nums[mid])
                end = mid - 1;
            else
                start = mid + 1;

            mid = start + (end-start)/2;
        }
        return mid;
    }

    public int binarySearch(int[] arr,int target,int start,int end)
    {
        int mid = start + (end-start)/2;

        while(start<=end)
        {
            if(target<arr[mid])
                end = mid - 1;
            else if(target>arr[mid])
                start = mid + 1;
            else
                return mid;
            mid = start + (end-start)/2;
        }
        return -1;
    }
}