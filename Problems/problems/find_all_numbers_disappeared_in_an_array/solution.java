class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
                swapVariables(nums,i,correct);
            else
                i++;
        }
        
        for(int j=0;j<nums.length;j++)
        {
            if(j!=nums[j]-1)
                missingNumbers.add(j+1);
        }
        return missingNumbers;
    }

    void swapVariables(int[] nums,int firstIndex,int secondIndex)
    {
        nums[firstIndex] = nums[firstIndex]+nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }
}