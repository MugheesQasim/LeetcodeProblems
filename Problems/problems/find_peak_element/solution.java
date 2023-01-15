class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;

        while(start<end)
        {
            if(nums[mid]>nums[mid+1])
                end = mid;
            else if(nums[mid]<nums[mid+1])
                start = mid + 1;
            
            mid = start + (end-start)/2;
            if(start==end)
                return mid;
        }
        return mid;
    }
}