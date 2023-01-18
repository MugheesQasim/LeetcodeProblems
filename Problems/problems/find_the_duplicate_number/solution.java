class Solution {
    public int findDuplicate(int[] nums) {
        
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(i!=correct)
            {
                if(nums[i]==nums[correct])
                    return nums[i];
                else
                    swapVariables(nums,i,correct);
            }
            else
                i++;
        }

        return -1;
    }

    void swapVariables(int[] nums,int firstIndex,int secondIndex)
    {
        nums[firstIndex] = nums[firstIndex]+nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }
}