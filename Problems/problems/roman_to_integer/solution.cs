public class Solution {
    public int RomanToInt(string s) {
        
        int numberToReturn = 0;
        
        for(int i = s.Length-1;i>=0;i--)
        {
            switch(s[i])
            {
                case 'V':
                    numberToReturn += 5;
                    break;
                    
                case 'I':
                    if(i!=s.Length-1)
                    {
                        if(s[i+1]=='V'||s[i+1]=='X')
                            numberToReturn -= 1;
                        else
                            numberToReturn +=1;
                    }
                    else
                        numberToReturn += 1;
                    break;
                    
                case 'L':
                    numberToReturn += 50;
                    break;
                    
                case 'X':
                    if(i!=s.Length-1)
                    {
                        if(s[i+1]=='L'||s[i+1]=='C')
                            numberToReturn -= 10;
                        else
                            numberToReturn +=10;
                    }
                    else
                        numberToReturn += 10;
                    break;
                    
                case 'D':
                    numberToReturn += 500;
                    break;
                    
                case 'M':
                    numberToReturn += 1000;
                    break;
                    
                case 'C':
                    if(i!=s.Length-1)
                    {
                        if(s[i+1]=='D'||s[i+1]=='M')
                            numberToReturn -= 100;
                        else
                            numberToReturn +=100;
                    }
                    else
                        numberToReturn += 100;    
                    break;
                    
                default:
                    break;
            }
        }
        return numberToReturn;
    }
}