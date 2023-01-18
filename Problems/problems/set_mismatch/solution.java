class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swapVariables(nums,i,correct);
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j+1 != nums[j])
                return new int[]{nums[j],j+1};
        }
        return new int[]{-1,-1};
    }

    void swapVariables(int[] nums,int firstIndex,int secondIndex)
    {
        nums[firstIndex] = nums[firstIndex]+nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }
}