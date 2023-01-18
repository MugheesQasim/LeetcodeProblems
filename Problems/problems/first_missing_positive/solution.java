class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && i !=correct && nums[i]!=nums[correct])
                swapVariables(nums,i,correct);
            else
                i++;
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!= j+1)
                return j+1;
        }

        return nums.length+1;
    }

    void swapVariables(int[] nums,int firstIndex,int secondIndex)
    {
        nums[firstIndex] = nums[firstIndex]+nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }
}