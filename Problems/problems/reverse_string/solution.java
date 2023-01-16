class Solution {
    public void reverseString(char[] s) {

        int length = (s.length%2 != 0) ? s.length/2 +1: s.length/2;

        for(int i=0;i<length;i++)
        {
            swapCharacters(s,i,s.length-1-i);
        }
    }

    void swapCharacters(char[] s,int firstIndex,int secondIndex)
    {
        char temp = s[secondIndex];
        s[secondIndex] = s[firstIndex];
        s[firstIndex] = temp;
    }
}