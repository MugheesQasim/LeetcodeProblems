class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                swapVariables(nums,i,nums[i]-1);
            }
            else
                i++;
        }

        for(int j=0;j<nums.length;j++)
        {
            if(j+1 != nums[j])
                missingNumbers.add(nums[j]);
        }
        return missingNumbers;
    }

    void swapVariables(int[] arr,int firstIndex,int secondIndex)
    {
        int temp = arr[secondIndex];
        arr[secondIndex] = arr[firstIndex];
        arr[firstIndex] = temp;
    }
}