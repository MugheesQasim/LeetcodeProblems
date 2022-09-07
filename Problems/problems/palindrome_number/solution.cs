public class Solution {
    public bool IsPalindrome(int x) {
        string palindrome = x.ToString();
        
        for(int i=0;i<palindrome.Length;i++)
        {
            if(palindrome[i]!=palindrome[palindrome.Length-i-1])
            {
                return false;
            }
        }
        return true;
    }
}