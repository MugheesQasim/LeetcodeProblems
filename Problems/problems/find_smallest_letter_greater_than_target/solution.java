class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid = start + (end-start)/2;

        if(letters[end]<target)
            return letters[0];

        while(start<=end)
        {
            if(target<letters[mid])
                end = mid - 1;
            else
                start = mid + 1;

            mid = start + (end-start)/2;
        }

        if(start<=letters.length-1)
            return letters[start];
        else
            return letters[0];
    }
}