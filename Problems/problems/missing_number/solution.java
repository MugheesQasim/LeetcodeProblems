class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(i==nums[i] || nums[i]==nums.length)
                i++;
            else
                swapVariables(nums,i,nums[i]);
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
                return j;
        }
        return i;
    }

    void swapVariables(int[] arr,int firstIndex,int secondIndex)
    {
        int temp = arr[secondIndex];
        arr[secondIndex] = arr[firstIndex];
        arr[firstIndex] = temp;
    }
}