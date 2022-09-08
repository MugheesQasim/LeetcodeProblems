public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        
        int minLength = 200;
        
        for(int i=0;i<strs.Length;i++)
        {
            if(minLength>strs[i].Length)
            {
                minLength = strs[i].Length;
            }
        }
        
        int index = 0;
        
        while(index<minLength)
        {
            char c = strs[0][index];
            
            for(int i =0;i<strs.Length;i++)
            {
                if(strs[i][index]!=c)
                {
                    return strs[i].Substring(0,index);
                }
            }
            index++;
        }
        
        return strs[0].Substring(0,index);
    }
}