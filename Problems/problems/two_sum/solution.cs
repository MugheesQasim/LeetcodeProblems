public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int []returningIndexArray = {0,0};
        
        for(int i=0;i<nums.Length;i++){
            for(int j=i+1;j<nums.Length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    returningIndexArray[0] = i;
                    returningIndexArray[1] = j;
                    
                    return returningIndexArray;
                }
            }
        }
         return returningIndexArray;
    }
}