class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num: nums)
        {
            if(even(num))
                count++;
        }

        return count;   
    }

    boolean even(int number)
    {
        return ((int)Math.log10(number)+1)%2 == 0;
    }
}