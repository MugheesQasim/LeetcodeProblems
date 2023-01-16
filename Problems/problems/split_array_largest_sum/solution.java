class Solution {
    public int splitArray(int[] nums, int k) {
        int rangeStart = maxArray(nums);
        int rangeEnd = sumArray(nums);
        int mid = rangeStart + (rangeEnd - rangeStart)/2;

        while(rangeStart<rangeEnd)
        {
            int sum = 0;
            int pieces = 1;
            for(int i=0;i<nums.length;i++)
            {
                if(sum+nums[i]>mid)
                {
                    pieces++;
                    sum = 0;
                }
                sum += nums[i];
            }
            if(pieces<=k)
                rangeEnd = mid;
            else
                rangeStart = mid + 1;
            mid = rangeStart + (rangeEnd - rangeStart)/2;
        }

        return rangeEnd;

}
int maxArray(int[] arr)
{
    int max = 0;
    for(int i: arr)
        if(i>max)
            max = i;
    return max;
}

int sumArray(int[] arr)
{
    int sum = 0;
    for(int i: arr)
        sum += i;
    return sum;
}
}



